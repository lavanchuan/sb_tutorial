package com.sb_tutorial.springboottutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlgorithmsController {

    @GetMapping({"/home", "/"})
    public String homePage(){
        return "index.html";
    }

    @GetMapping("/hello")
    public String helloPage(){
        return "hello.html";
    }

    // API
    @GetMapping("/big-sorting")
    public String bigSorting(){
        return "algorithms/big_sorting.html";
    }
}
