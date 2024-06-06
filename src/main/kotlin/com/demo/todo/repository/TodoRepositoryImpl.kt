package com.demo.todo.repository

import com.demo.todo.model.Todo
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class TodoRepositoryImpl : TodoRepository {

    var todos = mutableListOf<Todo>()

    override fun listTodos(): List<Todo> {
        return todos
    }

    override fun saveTodo(todo: Todo) {
        todos.add(todo)
    }

    override fun findTodo(id: UUID): Todo {
        return todos.single { it.id == id }
    }
}