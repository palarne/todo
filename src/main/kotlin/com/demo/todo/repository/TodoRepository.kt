package com.demo.todo.repository

import com.demo.todo.model.Todo

interface TodoRepository {

    fun listTodos(): List<Todo>

    fun saveTodo(todo: Todo)
}
