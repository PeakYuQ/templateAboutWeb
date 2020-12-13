package com.peakyu.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/table")
    public String Page1Table(){
        return "table";
    }

    @GetMapping("/chart")
    public String Page1Chart(){
        return "chart";
    }


}
