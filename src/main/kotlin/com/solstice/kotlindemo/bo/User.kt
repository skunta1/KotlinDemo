package com.solstice.kotlindemo.bo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(@Id val username: String,
                val firstName: String,
                val lastName: String) {
}