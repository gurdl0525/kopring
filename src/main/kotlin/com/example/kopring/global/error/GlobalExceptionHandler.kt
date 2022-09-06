package com.example.kopring.global.error

import BaseException
import org.springframework.context.support.DefaultMessageSourceResolvable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.util.stream.Collectors

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(BaseException::class)
    fun baseExceptionHandler(e: BaseException): ResponseEntity<String> {
        return ResponseEntity.status(e.errorCode.status)
            .body(e.errorCode.message)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun validException(e: MethodArgumentNotValidException): ResponseEntity<String>{
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(e.bindingResult.fieldErrors.stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.toList()).toString())
    }

}