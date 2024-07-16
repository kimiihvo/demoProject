package com.example.demoproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "타임리프.............");

        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello thymeleaf ~");
        return "hello";
    }

    @RequestMapping("/main")
    public String main(Model model) {
        model.addAttribute("message", "타임리푸.");
        return "main"; // "main"은 main.html 파일을 의미합니다.
    }
}