package com.alilopez.demo.login.presentation.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel() : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    private val _msn = MutableStateFlow("")
    val msn: StateFlow<String> = _msn

    fun print() {
        _msn.value = "Hola mundo"
    }
}