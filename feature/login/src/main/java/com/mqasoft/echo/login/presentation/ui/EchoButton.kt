package com.mqasoft.echo.login.presentation.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.mqasoft.echo.core.ui.colors.ForestGreen
import com.mqasoft.echo.login.R

@Composable
fun EchoButton(
    text: String,
    border: Color,
    buttonColor: Color,
    onClick: ()->Unit = {},
    textColor: Color = if (buttonColor == Color.White)  border else Color.White
){
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(buttonColor),
        shape = RectangleShape,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp).border(BorderStroke(3.dp, border))
    ) {
        Text(text = text, color = textColor)
    }
}