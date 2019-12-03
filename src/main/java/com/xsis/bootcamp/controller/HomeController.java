package com.xsis.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String viewHome() {
        return "home";
    }

    @GetMapping("/index")
    public String viewWelcome() {
        return "index";
    }

    @GetMapping("/employee")
    public String viewEmployee() {
        return "pages/employee";
    }
}