package com.example.kopring.domain.member

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: CrudRepository<User, Int> {
    fun existsByName(name: String): Boolean
}