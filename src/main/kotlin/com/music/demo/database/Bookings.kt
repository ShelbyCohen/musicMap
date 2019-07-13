package com.music.demo.database

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Bookings : JpaRepository<BookingsEntity, Int> {

//    fun findByAuthId(authId: String) : BookingsEntity

}