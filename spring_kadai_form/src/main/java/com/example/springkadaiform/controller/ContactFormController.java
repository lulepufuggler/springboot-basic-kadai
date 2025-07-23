package com.example.springkadaiform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springkadaiform.form.ContactForm;

@Controller
public class ContactFormController {

	 // お問い合わせフォーム
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("contactform", new ContactForm());
        return "contactFormView";
    }
    
    // 入力確認画面
    @PostMapping("/confirm")
    public String confirm(
            @Validated ContactForm form,BindingResult result) {

        
        if (result.hasErrors()) {
        	return "contactFormView";
        	
        }

         // バリデーションOKの場合は、確認画面に遷移
            return "confirmView"; 
        }
        
            }
    
    
