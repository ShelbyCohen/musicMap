package com.music.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MusicMapApplication

fun main(args: Array<String>) {
	runApplication<MusicMapApplication>(*args)
}
