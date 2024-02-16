package com.mqasoft.echo.core.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.rememberCoroutineScope

import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mqasoft.echo.core.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EchoBottomSheet(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit = {},
    errorText: String,
    buttonText: String
){
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()

    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        sheetState = sheetState
    ){
        Column(modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image( modifier = Modifier.size(100.dp),
                painter = painterResource(id = R.drawable.error_logo), contentDescription = "Logo")
            Text(errorText)
            EchoDButton(text = buttonText,
                border = Color.Black,
                buttonColor = Color.Black,
                modifier = Modifier.padding(bottom = 5.dp) ,
                onClick = onDismissRequest,
                sheetState = sheetState, scope = scope
            )
        }
    }
}