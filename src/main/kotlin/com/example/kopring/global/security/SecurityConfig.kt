package com.example.kopring.global.security

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.cors.CorsUtils
import kotlin.jvm.Throws

@Configuration
@EnableWebSecurity
class SecurityConfig: WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
            .csrf().disable()
            .httpBasic().disable()
            .formLogin().disable()
            .cors()

            .and()
            .authorizeRequests()
            .requestMatchers(CorsUtils::isCorsRequest).permitAll()
            .antMatchers("/**").permitAll()
            .anyRequest().permitAll()
    }
}