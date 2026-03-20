package com.alilopez.demo.features.login.domain.usecase

class LoginUseCase {
    operator fun invoke(username: String, password: String): Boolean {
        return username == "admin" && password == "1234"
    }
}