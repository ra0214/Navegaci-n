package com.alilopez.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.alilopez.demo.count.presentation.CountScreen
import com.alilopez.demo.counter.presentation.CounterScreen
import com.alilopez.demo.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                CounterScreen()
            }
        }
    }
}
