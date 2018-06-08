package com.solstice.kotlindemo.repository

import com.solstice.kotlindemo.bo.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<User, String> {

}