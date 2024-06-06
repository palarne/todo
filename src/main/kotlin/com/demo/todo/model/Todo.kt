package com.demo.todo.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Todo(
    @Id
    val id: UUID,
    val name: String,
    val description: String,
)
