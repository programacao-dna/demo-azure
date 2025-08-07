package com.example.demo_azure.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data é uma anotação do Lombok que gera getters, setters, toString, equals e hashCode.
@Data
// @AllArgsConstructor gera um construtor com todos os campos.
@AllArgsConstructor
// @NoArgsConstructor gera um construtor vazio, útil para frameworks.
@NoArgsConstructor
public class Task {
    private Long id;
    private String description;
    private boolean completed;
}