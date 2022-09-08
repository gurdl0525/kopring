package com.example.kopring.domain.member.dto

data class CreateMemberRequest(
    val age: Int,
    val name: String,
    val password: String
)
