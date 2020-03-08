package com.example.demo.controller.index;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(final Model model, final HttpServletResponse response) {
        model.addAttribute("name", "simonsfan");
        return "index";
    }
}