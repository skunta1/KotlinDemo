package com.solstice.kotlindemo.controller

import com.solstice.kotlindemo.bo.User
import com.solstice.kotlindemo.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userRepository: UserRepository) {

    @GetMapping("/")
    fun home(): String {
        userRepository.save(User("skunta", "Sampath", "Kunta"))
        val users = userRepository.findAll()
        print(users.count())
        return "Home"
    }


}