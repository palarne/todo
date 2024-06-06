package com.demo.todo.service

import com.demo.todo.model.Todo

interface TodoService {

    fun list(): List<Todo>

    fun save(todo: Todo)
}
