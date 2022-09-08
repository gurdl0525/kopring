package com.example.kopring.domain.member.exception

import BaseException
import com.example.kopring.global.error.ErrorCode

class DuplicateMemberException private constructor(): BaseException(ErrorCode.DUPLICATE_MEMBER){
    companion object{
        @JvmField
        val Exception = DuplicateMemberException()
    }
}