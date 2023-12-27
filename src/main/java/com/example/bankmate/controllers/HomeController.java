package com.example.bankmate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String getHomePage() {
        return "home.html";
    }
    @GetMapping("/signin")
    public String getSignPage(){
        return "signin.html";
    }
    @GetMapping("/contact")
    public String getContactPage(){
        return "contact.html";
    }
    @PostMapping("/signin")
    public String signUserIn(){
        return "/users";
    }
}
