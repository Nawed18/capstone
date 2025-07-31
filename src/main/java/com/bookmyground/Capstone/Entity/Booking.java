package com.bookmyground.Capstone.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public System_user.User getUser() {
        return user;
    }

    public void setUser(System_user.User user) {
        this.user = user;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    @ManyToOne
    private System_user.User user;

    @ManyToOne
    private Ground ground;

    private LocalDate bookingDate;
}
