package com.demo.todo.repository

import com.demo.todo.model.Todo
import java.util.*

interface TodoRepository {

    fun listTodos(): List<Todo>

    fun saveTodo(todo: Todo)

    fun findTodo(id: UUID): Todo
}
