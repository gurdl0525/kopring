package com.example.kopring.domain.member.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member(
        id: Int?,
        name: String,
        age: Int,
        password: String

) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @Column(name = "member_name", length = 5, nullable = false)
    var name = name

    @Column(name = "member_age", nullable = false)
    var age = age

    @Column(name = "member_password", length = 60, nullable = false)
    var password = password

}