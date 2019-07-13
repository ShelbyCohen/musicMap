package com.music.demo.database

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface Tours : JpaRepository<ToursEntity, Int> {

    fun findByAgent(agent: String) : ToursEntity

}