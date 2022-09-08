package com.example.kopring.domain.member.service

import com.example.kopring.global.common.MessageResponse
import com.example.kopring.domain.member.dto.CreateMemberRequest

interface MemberService {
    fun join(request: CreateMemberRequest): MessageResponse
}