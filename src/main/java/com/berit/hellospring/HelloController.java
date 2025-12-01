package com.berit.hellospring;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting(Model model) {

        String name = "Berit";
        model.addAttribute("name", name);

        return "Hello";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
