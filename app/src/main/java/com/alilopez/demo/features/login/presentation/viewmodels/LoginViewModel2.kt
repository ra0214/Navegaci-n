package com.alilopez.demo.features.login.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.alilopez.demo.features.login.domain.usecase.LoginUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel2(useCase : LoginUseCase) : ViewModel() {

    private val _username = MutableStateFlow("")
    val username = _username.asStateFlow()

    private val _password = MutableStateFlow("")
    val password = _password.asStateFlow()

    private val _error = MutableStateFlow("")
    val error = _error.asStateFlow()

    fun onChangeUsername( it : String) {
        _username.value = it
    }

    fun onChangePassword(it : String) {
        _password.value = it
    }
    fun onLogin() {}

}