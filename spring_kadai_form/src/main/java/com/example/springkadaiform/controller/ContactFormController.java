package com.example.springkadaiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springkadaiform.form.ContactForm;

@Controller
public class ContactFormController {

	 // お問い合わせフォーム
    @GetMapping("/form")
    public String form(Model model) {
        return "contactFormView";
    }
    
    
    // 入力確認画面
    @PostMapping("/confirm")
    public String confirm(
            @Validated ContactForm form, 
            BindingResult result,
            RedirectAttributes redirectAttributes) {
        
        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.contactForm", result);
            redirectAttributes.addFlashAttribute("contactForm", form);
            return "redirect:/form";
            
        }

         // バリデーションOKの場合は、確認画面に遷移
            return "confirmView"; 
            
        }
    }
    

    
        

    
    
