package com.start_up.simulatedStock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "main";
    }

    @GetMapping("/offline")
    public String customPage(Module module) {



        return "customplay";
    }


}
