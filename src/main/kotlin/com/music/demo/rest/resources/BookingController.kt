package com.music.demo.rest.resources

import com.music.demo.rest.services.BookingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookingController(@Autowired private val bookingService: BookingService) {


    @GetMapping("/book", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun addBooking(): String {
        return bookingService.addBooking()
    }

}