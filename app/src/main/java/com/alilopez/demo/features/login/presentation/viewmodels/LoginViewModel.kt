package com.alilopez.demo.features.login.presentation.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel : ViewModel() {

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
    
    fun onLogin() {
        if (username.value == "admin" && password.value == "1234") {
            _error.value = ""
            // Proceed with login
        } else {
            _error.value = "Credenciales incorrectas"
        }
    }
}