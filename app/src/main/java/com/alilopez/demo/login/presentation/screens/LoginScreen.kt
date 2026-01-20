package com.alilopez.demo.login.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

import androidx.lifecycle.viewmodel.compose.viewModel
import com.alilopez.demo.R
import com.alilopez.demo.login.presentation.viewmodels.LoginViewModel

@Composable
fun LoginScreen(viewModel: LoginViewModel = viewModel()) {
    var username = remember {  mutableStateOf("")}
    var password = remember {  mutableStateOf("")}
    val count by viewModel.count.collectAsState()
    val state by viewModel.count.collectAsStateWithLifecycle()


    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {
        Image(modifier = Modifier.size(150.dp),
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Logo empresa")
        Spacer(modifier = Modifier.height(40.dp))
        TextField(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 10.dp),
            value = username.value,
            onValueChange = {it:String -> username.value = it},
            label = {Text("Username")},
            placeholder = {Text("Username")},

        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 10.dp),
            value = password.value,
            onValueChange = {it:String -> password.value = it},
            placeholder = {Text("Password")}
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 10.dp),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White),
            shape = RoundedCornerShape(10.dp),
        ) {
            Text("Iniciar sesión")
        }
    }
}

@Preview (showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}