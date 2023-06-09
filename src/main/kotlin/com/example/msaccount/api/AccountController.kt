package com.example.msaccount.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController {
    @RequestMapping("/test")
    fun test(): String {
        return "test"
    }

    @RequestMapping("/list")
    fun list(): List<String> {
        return listOf("Account 1", "Account 2", "Account 3")
    }

}