package com.music.demo.rest.resources

import com.music.demo.database.BookingsEntity
import com.music.demo.rest.services.BookingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class BookingController(@Autowired private val bookingService: BookingService) {


    @GetMapping("/book", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun addBooking(): String {
        val newBooking = BookingsEntity(
                tourId = 2,
                venue = "testVenue",
                address = "testAddress",
                contactName = "",
                contactNumber = "",
                timeOnStage = "30",
                date = Calendar.getInstance().time
        )
        return bookingService.addBooking(newBooking)
    }

}