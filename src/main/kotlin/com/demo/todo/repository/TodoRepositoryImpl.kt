package com.demo.todo.repository

import com.demo.todo.model.Todo
import org.springframework.stereotype.Repository

@Repository
class TodoRepositoryImpl : TodoRepository {

    var todos = mutableListOf<Todo>()

    override fun listTodos(): List<Todo> {
        return todos
    }

    override fun saveTodo(todo: Todo) {
        todos.add(todo)
    }
}