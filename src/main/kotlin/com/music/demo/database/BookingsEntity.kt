package com.music.demo.database

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "bookings")
class BookingsEntity(

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,

        @Column(name = "tourId")
        val tourId: Int = 0,

        @Column(name = "venue")
        val venue: String = "",

        @Column(name = "address")
        val address: String = "",

        @Column(name = "contactName")
        val contactName: String = "",

        @Column(name = "contactNumber")
        val contactNumber: String = "",

        @Column(name = "timeOnStage")
        val timeOnStage: String = "",

        @Column(name = "date")
        @Temporal(TemporalType.DATE)
        val date: Date = Date(),

        @ManyToOne(
                optional = false,
                cascade = [CascadeType.PERSIST]
        )
        @JoinColumn(
                name = "tourId",
                insertable = false,
                updatable = false
        )
        private var tourForBooking: ToursEntity? = null
)

