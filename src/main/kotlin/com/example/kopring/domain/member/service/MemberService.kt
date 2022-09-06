package com.example.kopring.domain.member.service

import com.example.kopring.domain.dto.MessageResponse
import com.example.kopring.domain.member.controller.dto.request.CreateMemberRequest

interface MemberService {
    fun join(request: CreateMemberRequest): MessageResponse
}