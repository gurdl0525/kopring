package com.example.kopring.domain.member.dto

data class CreateMemberRequest(
    val accountId: String,
    val age: Int,
    val name: String,
    val password: String
)
