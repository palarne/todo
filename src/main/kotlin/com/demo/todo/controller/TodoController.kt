package com.demo.todo.controller

import com.demo.todo.model.Todo
import com.demo.todo.model.TodoCreateRequest
import com.demo.todo.service.TodoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RequestMethod.POST
import java.util.UUID.fromString
import java.util.UUID.randomUUID

@RestController
class TodoController(
    val service: TodoService,
) {

    @RequestMapping(value = ["/todos"], method = [GET])
    @ResponseBody
    fun getAllTodos(): ResponseEntity<List<Todo>> {
        return service.list().let { ResponseEntity.ok().body(it) }
    }

    @RequestMapping(value = ["/todos/{id}"], method = [GET])
    @ResponseBody
    fun getOneTodo(@PathVariable("id") id: String): ResponseEntity<Todo> {
        return service.get(fromString(id)).let { ResponseEntity.ok().body(it) }
    }

    @RequestMapping(value = ["/todos"], method = [POST])
    fun postOneTodo(@RequestBody todoCreateRequest: TodoCreateRequest) {
        val todo = Todo(
            id = randomUUID(),
            name = todoCreateRequest.name,
            description = todoCreateRequest.description,
        )
        service.save(todo)
    }
}
