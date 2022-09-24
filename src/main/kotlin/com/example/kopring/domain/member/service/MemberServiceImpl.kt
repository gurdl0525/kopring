package com.example.kopring.domain.member.service

import com.example.kopring.global.common.MessageResponse
import com.example.kopring.domain.member.dto.CreateMemberRequest
import com.example.kopring.domain.member.User
import com.example.kopring.domain.member.UserRepository
import com.example.kopring.domain.member.exception.DuplicateMemberException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
): MemberService {
    override fun join(request: CreateMemberRequest): MessageResponse {
        if(userRepository.existsByName(request.name)){
            throw DuplicateMemberException.Exception
        }
        userRepository.save(
            User(
            name = request.name,
            age = request.age,
            accountId = request.accountId,
            password = passwordEncoder.encode(request.password)
        ))
        return MessageResponse(
            message = "회원가입 완료"
        )
    }
}