package com.example.geminiaichat

import android.graphics.Bitmap
import com.example.geminiaichat.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
