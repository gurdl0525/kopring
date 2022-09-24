package com.example.kopring.domain.member

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Size

@Entity
class User(
        accountId: String,
        password: String,
        age: Int,
        name: String

) {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @Column(name = "account_id", nullable = false)
    @Size(min = 4, max = 15)
    var accountId = accountId
        protected set

    @Column(name = "password", nullable = false)
    @Size(min = 4, max = 15)
    var password = password
        protected set

    @Column(name = "age", nullable = false)
    var age = age
        protected set

    @Column(name = "name", length = 5, nullable = false)
    @Size(min = 1, max = 4)
    var name = name
        protected set

}