package com.mqasoft.echo.login.presentation.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun EchoTitle(title: String){
    Text(
        modifier = Modifier.padding(start = 10.dp),
        text = title,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
    )
}