package com.mqasoft.echo.home.domain

import java.util.Date

data class Message(
    val id: String,
    var chatUsers: ArrayList<String>,
    var createdAt: Date? = Date(),
    var type: String = "text", //0=text,1=audio,2=image,3=video,4=file
    var status: Int = 0, //0=sending,1=sent,2=delivered,3=seen,4=failed
    var textMessage: String,
    var chatUserId: String? = null
)
