package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {
    private final ToDoService todoService;

    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/adminuser")
    public String adminUser(Model model) {
        // 最新のユーザーリストを取得
    	List<ToDo> users = todoService.getAllToDos();

        // ビューにユーザーリストを渡す
        model.addAttribute("todos", "todos");

        return "todoView";
    }


@PostMapping("/register")
public String registerUser(RedirectAttributes redirectAttributes,
        @RequestParam("title") String title,
        @RequestParam("priority") String priority,
        @RequestParam("status") int status) {


    // adminuserにリダイレクトしてリストを再表示
    return "redirect:/todoView";
}
}
