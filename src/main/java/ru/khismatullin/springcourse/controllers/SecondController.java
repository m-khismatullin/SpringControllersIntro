package ru.khismatullin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/second")
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
