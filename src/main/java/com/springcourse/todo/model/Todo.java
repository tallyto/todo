package com.springcourse.todo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

// Data Class -> propriedades e getters e setters
@Entity // entidade do banco de dados -> tabela do banco de dados
@Getter // lombok -> gera os getters em tempo de compilação
@Setter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // definir coluna id como auto incremento 1, 2, 3 ...
    private Long id; // chave primária

    @Column
    private String description;

    @Column
    private Boolean done;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss") // formatação da data
    private LocalDateTime createdDate;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss") // formatação da data
    private LocalDateTime doneDate;

    @PrePersist
    public void beforeInsert() {
        setCreatedDate(LocalDateTime.now());
    }
}
