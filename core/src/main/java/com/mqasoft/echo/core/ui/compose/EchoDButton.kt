package com.mqasoft.echo.core.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EchoDButton(
    modifier: Modifier = Modifier,
    text: String,
    border: Color,
    buttonColor: Color,
    onClick: ()->Unit = {},
    textColor: Color = if (buttonColor == Color.White)  border else Color.White,
    sheetState: SheetState,
    scope: CoroutineScope
){
    Button(
        onClick = {
            scope.launch {
            sheetState.hide()
        }.invokeOnCompletion {
            onClick()
        }},
        colors = ButtonDefaults.buttonColors(buttonColor),
        shape = RectangleShape,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .border(BorderStroke(3.dp, border))
    ) {
        Text(text = text, color = textColor)
    }
}