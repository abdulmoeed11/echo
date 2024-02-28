package com.mqasoft.echo.core.database.user_list

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid: Int = 0,
    val name: String
)
