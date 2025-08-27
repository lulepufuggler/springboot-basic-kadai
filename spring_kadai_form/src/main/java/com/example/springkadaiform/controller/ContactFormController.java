package com.example.springkadaiform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springkadaiform.form.ContactForm;

import jakarta.validation.Valid;

@Controller
public class ContactFormController {
    
    // お問い合わせフォーム
    @GetMapping("/form")
    public String showForm(Model model) {
        // 新しいContactFormオブジェクトをモデルに追加
        model.addAttribute("contactForm", new ContactForm());
        return "contactFormView";
       
    }
    
    // 入力確認画面
    @PostMapping("/confirm")
    public String confirmForm(@Valid @ModelAttribute ContactForm contactForm,
            BindingResult bindingResult,
            Model model,
            RedirectAttributes redirectAttributes) {

// バリデーションエラーがある場合
if (bindingResult.hasErrors()) {
// エラーメッセージと入力内容を保持してフォーム画面にリダイレクト
redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.contactForm", bindingResult);
redirectAttributes.addFlashAttribute("contactForm", contactForm);
return "redirect:/form";
}

// バリデーションOKの場合、確認画面を表示
model.addAttribute("contactForm", contactForm);
return "confirmView";
}

	}
      
        

    
    
    
    
