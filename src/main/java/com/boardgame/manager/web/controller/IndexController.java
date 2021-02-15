package com.boardgame.manager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;

@Controller
public class IndexController {

    private static final String VIEW = "index";

    @RequestMapping("/index")
    public String getIndexPage() {
        return VIEW;
    }

    // Todo: Work in progress.
    @PostMapping({"/search","search"})
    public String suche(@RequestParam("name") String name, Model model) {
        model.addAttribute("gamename", "name");
        return VIEW;
    }

    @GetMapping(value = "/search", params = {"name"})
    public String showResults(@RequestParam("name") String name, Model model) {
        model.addAttribute("gamename", name);
        Instant instant = Instant.now();
        model.addAttribute("date", instant.toEpochMilli());
        return VIEW;
    }
}
