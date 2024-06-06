package com.demo.todo.controller

import com.demo.todo.model.Todo
import com.demo.todo.model.TodoCreateRequest
import com.demo.todo.service.TodoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RequestMethod.POST
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import java.util.UUID.randomUUID

@RestController
class TodoController(
    val service: TodoService,
) {

    @RequestMapping(
        value = ["/todos"],
        method = [GET],
    )
    @ResponseBody
    fun getAllTodos(): ResponseEntity<List<Todo>> {
        return service.list().let { ResponseEntity.ok().body(it) }
    }

    @RequestMapping(
        value = ["/todos"],
        method = [POST],
    )
    @ResponseBody
    fun postOneTodo(@RequestBody todoCreateRequest: TodoCreateRequest) {
        val todo = Todo(
            id = randomUUID(),
            name = todoCreateRequest.name,
            description = todoCreateRequest.description,
        )
        service.save(todo)
    }
}
