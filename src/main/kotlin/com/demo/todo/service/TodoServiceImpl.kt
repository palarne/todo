package com.demo.todo.service

import com.demo.todo.model.Todo
import com.demo.todo.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl(
    val repository: TodoRepository,
) : TodoService {

    override fun list(): List<Todo> {
        return repository.listTodos()
    }

    override fun save(todo: Todo) {
        repository.saveTodo(todo)
    }
}