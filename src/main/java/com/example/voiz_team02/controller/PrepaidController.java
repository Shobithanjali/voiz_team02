package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prepaid")
public class PrepaidController{
        @GetMapping
        public String show(Model model){
            return "prepaid";
        }
}