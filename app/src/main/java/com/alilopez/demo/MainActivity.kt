package com.alilopez.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.alilopez.demo.core.di.AppContainer
import com.alilopez.demo.features.counter.presentation.CounterScreen
import com.alilopez.demo.core.ui.theme.AppTheme
import com.alilopez.demo.features.rickandmorty.di.CharactersModule
import com.alilopez.demo.features.rickandmorty.presentation.screens.CharactersScreen

class MainActivity : ComponentActivity() {
    lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appContainer = AppContainer(this)
        val charactersModule = CharactersModule(appContainer)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                CharactersScreen(charactersModule.provideCharactersViewModelFactory())
            }
        }
    }
}
