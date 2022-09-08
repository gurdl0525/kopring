package com.example.kopring.global.error

import org.springframework.http.HttpStatus

enum class ErrorCode(val status: HttpStatus,
                     val message: String
) {
     DUPLICATE_MEMBER(HttpStatus.BAD_REQUEST, "Duplicate Member");

}