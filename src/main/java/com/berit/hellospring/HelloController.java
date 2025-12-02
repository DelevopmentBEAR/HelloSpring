package com.berit.hellospring;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Controller for HelloSpring App
public class HelloController {

    @GetMapping("/")
    // GetMapping + / = homepage called greeting with models for variables
    public String greeting(Model model) {

        // String for name
        String name = "Berit";
        // Adds variables to hello.mustache
        model.addAttribute("name", name);
        model.addAttribute("className", "Java");
        model.addAttribute("classCode", "2545");
        // Returns to hello.mustache
        return "Hello";
    }

    @GetMapping("/about")
    // GetMapping + /about = about page
    public String about() {
        return "about";
    }

}
