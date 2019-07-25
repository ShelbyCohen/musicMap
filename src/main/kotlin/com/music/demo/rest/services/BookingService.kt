package com.music.demo.rest.services

import com.music.demo.database.Bookings
import com.music.demo.database.BookingsEntity
import com.music.demo.database.Tours
import com.music.demo.database.ToursEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookingService(@Autowired val tours: Tours,
                     @Autowired val bookings: Bookings) {

    fun addBooking(newBooking: BookingsEntity): String {
        bookings.save(newBooking)

        return "Booking added!"
    }


    fun addTour(tour: ToursEntity): String {
        tours.save(tour)

        return "Tour added!"
    }
}