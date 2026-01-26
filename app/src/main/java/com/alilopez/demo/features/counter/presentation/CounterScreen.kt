package com.alilopez.demo.features.counter.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreen(viewModel: CounterViewModel = viewModel()) {
    val count  by viewModel.count.collectAsStateWithLifecycle()
    Column(modifier = Modifier
        .fillMaxSize()) {
        Surface(
            color = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Counter App", style = MaterialTheme.typography.displaySmall)
                Text("By ASLZ", style = MaterialTheme.typography.bodyMedium)
            }
        }
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(color = Color.LightGray),
            contentAlignment = Alignment.Center) {
            Text("${count}", style = MaterialTheme.typography.displayLarge)
        }
        Row(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .background(color = Color.Gray),
            verticalAlignment = Alignment.CenterVertically) {
            Button(modifier = Modifier
                .weight(1f)
                .padding(5.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White),
                onClick = {viewModel.decrement()}
            ) {
                Text("-",
                    fontSize = 30.sp)
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White),
                onClick = {viewModel.increment()}
            ) {
                Text("+",
                    fontSize = 30.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterScreenPreview() {
    CounterScreen()
}