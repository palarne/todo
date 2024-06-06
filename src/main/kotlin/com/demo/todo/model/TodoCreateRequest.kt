package com.demo.todo.model

data class TodoCreateRequest(
    val name: String,
    val description: String,
)