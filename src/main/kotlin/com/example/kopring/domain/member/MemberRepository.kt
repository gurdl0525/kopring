package com.example.kopring.domain.member

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: CrudRepository<Member, Int> {
    fun existsByName(name: String): Boolean
}