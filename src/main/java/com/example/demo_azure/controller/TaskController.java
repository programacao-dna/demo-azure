package com.example.demo_azure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_azure.entity.Task;

@RestController
@RequestMapping("/api/tasks") // Define a rota base para este controlador
public class TaskController {

    // Mapeia requisições GET para /api/tasks
    @GetMapping
    public List<Task> getAllTasks() {
        // Retorna uma lista de tarefas mockadas (dados de exemplo).
        // O Spring Boot converterá esta lista em JSON automaticamente.
        return List.of(
                new Task(1L, "Configurar ambiente de desenvolvimento", true),
                new Task(2L, "Criar o projeto Spring Boot inicial", true),
                new Task(3L, "Definir a entidade Task", false),
                new Task(4L, "Fazer o deploy da aplicação no Azure", false));
    }
}