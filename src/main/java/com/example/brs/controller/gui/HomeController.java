package com.example.brs.controller.gui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/dashboard")
    public String home() {
        return "dashboard";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}
