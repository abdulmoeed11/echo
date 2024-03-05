package com.mqasoft.echo.home.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.mqasoft.echo.home.presentation.ui.ProfileItem

@Composable
fun HomeScreen(){
    Column {
        ProfileItem()
        HorizontalDivider()
        ProfileItem()
    }
}