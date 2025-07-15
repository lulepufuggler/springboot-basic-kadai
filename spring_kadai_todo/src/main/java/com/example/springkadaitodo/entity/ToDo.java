package com.example.springkadaitodo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ToDos")
@Data
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private Integer todoId;

    @Column(name = "todo_title")
    private String todotitle;

    @Column(name = "todo_priority")
    private String todopriority;

    @Column(name = "todo_status")
    private String todostatus;
}