package com.example.kopring.domain.member.service

import com.example.kopring.domain.dto.MessageResponse
import com.example.kopring.domain.member.controller.dto.request.CreateMemberRequest
import com.example.kopring.domain.member.entity.Member
import com.example.kopring.domain.member.entity.MemberRepository
import com.example.kopring.global.error.exception.DuplicateMemberException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(private val memberRepository: MemberRepository,
                        private val passwordEncoder: PasswordEncoder): MemberService {
    override fun join(request: CreateMemberRequest): MessageResponse {
        if(memberRepository.existsByName(request.name)){
            throw DuplicateMemberException.Exception
        }
        memberRepository.save(Member(
            id = null,
            name = request.name,
            age = request.age,
            password = passwordEncoder.encode(request.password)
        ))
        return MessageResponse(
            message = "회원가입 완료"
        )
    }
}