package com.solstice.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlindemoApplication

fun main(args: Array<String>) {
    runApplication<KotlindemoApplication>(*args)
}
