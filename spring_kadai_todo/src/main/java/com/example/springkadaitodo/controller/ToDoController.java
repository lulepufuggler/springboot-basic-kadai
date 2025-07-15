package com.example.springkadaitodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {
    @GetMapping("/view")
    public String viewDemo() {
        return "todoView";
    }
}