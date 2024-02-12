package com.mqasoft.echo.login.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.mqasoft.echo.core.ui.colors.ForestGreen
import com.mqasoft.echo.login.R
import com.mqasoft.echo.login.presentation.ui.EchoButton
import com.mqasoft.echo.login.presentation.ui.EchoTextField
import com.mqasoft.echo.login.presentation.ui.EchoTitle
import com.mqasoft.echo.core.R as coreR

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Box(modifier = Modifier.fillMaxSize()){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = coreR.drawable.echo_logo),
                contentDescription = "Logo",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            EchoTitle(title = stringResource(id = R.string.email))
            EchoTextField(value = "", onValueChange = {})
            EchoTitle(title = stringResource(id = R.string.password))
            EchoTextField(value = "", onValueChange = {})
            Text(
                modifier = Modifier.padding(start = 10.dp),
                text = stringResource(id = R.string.forgot_password), color = ForestGreen
            )
            EchoButton(
                text = stringResource(id = R.string.login),
                border = Color.Black,
                buttonColor = ForestGreen
            )
            EchoButton(
                text = stringResource(id = R.string.register),
                border = ForestGreen,
                buttonColor = Color.White
            )
        }
    }
}