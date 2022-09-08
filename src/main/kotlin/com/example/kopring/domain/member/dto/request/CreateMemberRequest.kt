package com.example.kopring.domain.member.dto.request

data class CreateMemberRequest(
    val age: Int,
    val name: String,
    val password: String
)
