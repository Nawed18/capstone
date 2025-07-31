package com.bookmyground.Capstone.Service;

import com.bookmyground.Capstone.Entity.Booking;
import com.bookmyground.Capstone.Entity.Ground;
import com.bookmyground.Capstone.Entity.System_user;
import com.bookmyground.Capstone.repository.BookingRepository;
import com.bookmyground.Capstone.repository.GroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    GroundRepository groundRepository;

    public Booking book(Long groundId, System_user.User user){

        Ground ground=groundRepository.findById(groundId).orElseThrow(()
                -> new RuntimeException("Ground not found with ID: " + groundId));
        if (!ground.isAvailable()) {
            throw new RuntimeException("Ground is already booked.");
        }
        ground.setAvailable(false);
        groundRepository.save(ground);

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setGround(ground);
        booking.setBookingDate(LocalDate.now());

        return bookingRepository.save(booking);
    }
}
