package com.alilopez.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alilopez.demo.core.di.AppContainer
import com.alilopez.demo.core.ui.theme.AppTheme
import com.alilopez.demo.features.login.presentation.screens.LoginScreen
import com.alilopez.demo.features.rickandmorty.di.CharactersModule
import com.alilopez.demo.features.rickandmorty.presentation.screens.CharactersScreen

class MainActivity : ComponentActivity() {
    private lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appContainer = AppContainer(this)
        val charactersModule = CharactersModule(appContainer)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                AppNavigation(charactersModule)
            }
        }
    }
}

@Composable
fun AppNavigation(charactersModule: CharactersModule) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate("characters") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }
        composable("characters") {
            CharactersScreen(charactersModule.provideCharactersViewModelFactory())
        }
    }
}