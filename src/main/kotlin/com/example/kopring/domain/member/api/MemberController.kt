package com.example.kopring.domain.member.api

import com.example.kopring.global.common.MessageResponse
import com.example.kopring.domain.member.dto.CreateMemberRequest
import com.example.kopring.domain.member.service.MemberService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(private val memberService: MemberService){

    @PostMapping("/sign-up")
    fun createMember(@RequestBody request: CreateMemberRequest): MessageResponse {
        return memberService.join(request)
    }
}
