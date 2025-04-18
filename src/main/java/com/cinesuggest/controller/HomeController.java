package com.cinesuggest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("title", "CineSuggest - Home"); // Optional: Set a specific title for the home page
        return "index";
    }

    // You can add more handler methods for other pages here
    // For example:
    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("title", "CineSuggest - Movies");
        // Add logic to fetch and display movies
        return "movies"; // Assuming you have a movies.html template
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "CineSuggest - Login");
        return "login"; // Assuming you have a login.html template
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "CineSuggest - Register");
        return "register"; // Assuming you have a register.html template
    }

    // Add more controllers as needed for different parts of your application
}