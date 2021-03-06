package com.example.model

import com.example.util.enums.Order
import kotlinx.serialization.Serializable

@Serializable
data class TaskList(
    val id: Int?,
    var name: String,
    val tasks: ArrayList<Task>,
    var order: Order
)
