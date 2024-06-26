package com.demo.todo.service

import com.demo.todo.model.Todo
import java.util.*

interface TodoService {

    fun list(): List<Todo>

    fun save(todo: Todo)

    fun get(id: UUID): Todo
}
