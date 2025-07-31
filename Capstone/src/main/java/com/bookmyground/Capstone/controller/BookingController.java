package com.bookmyground.Capstone.controller;

import com.bookmyground.Capstone.Entity.Booking;
import com.bookmyground.Capstone.Entity.System_user;
import com.bookmyground.Capstone.Service.BookingService;
import com.bookmyground.Capstone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/book")
    public Booking book(@RequestParam Long groundId,@RequestParam Long userId){
        System_user.User user = userRepository.findById(userId).orElseThrow();
        return bookingService.book(groundId,user);
    }
}
