package com.music.demo.database

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "tours")
class ToursEntity(

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,

        @Column(name = "artist")
        val artist: String = "",

        @Column(name = "manager")
        val manager: String = "",

        @Column(name = "agent")
        val agent: String = "",

        @Column(name = "startDate")
        @Temporal(TemporalType.DATE)
        val startDate: Date = Date(),

        @Column(name = "endDate")
        @Temporal(TemporalType.DATE)
        val endDate: Date = Date(),

        @OneToMany(
                mappedBy = "tours",
                targetEntity = BookingsEntity::class,
                fetch = FetchType.LAZY,
                cascade = [CascadeType.PERSIST]
        )
        private var bookings: Collection<BookingsEntity>? = null
)

