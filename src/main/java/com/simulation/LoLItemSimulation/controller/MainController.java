package com.simulation.LoLItemSimulation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/lol")
    public String list(Model model){
        return "lolMain";
    }

        @GetMapping("/lol")
    public String list(Model model){
        return "lolMain";
    }

    
    @GetMapping("/")
    public String helloPage() {
        return "index";
    }

    @GetMapping("/itemTier")
    public String itemTierList() {
        return "itemTier";
    }
    @GetMapping("/simulation")
    public String simulation(Model model) {
        return "simulation";
    }
}
