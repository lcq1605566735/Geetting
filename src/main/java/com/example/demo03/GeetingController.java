package com.example.demo03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GeetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required = false)String name, Model model){
        model.addAttribute("name",name);
        return "good";
    }
}
