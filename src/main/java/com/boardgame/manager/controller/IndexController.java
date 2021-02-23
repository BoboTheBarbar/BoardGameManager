package com.boardgame.manager.controller;

import com.boardgame.manager.Bootstrap;
import com.boardgame.manager.responseDtos.GameListDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;

@Controller
public class IndexController {

    private static final String VIEW = "index";

//    @Autowired
    RestTemplate restTemplate;
    private Logger log = LoggerFactory.getLogger(Bootstrap.class);

//    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    public IndexController(RestTemplate restTemplate, RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplate;
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @GetMapping("/index")
    public String getIndexPage(Model model) {
        log.info("requesting index page...");
        System.out.println("hi");
        model.addAttribute("hi", "hihi");
        return VIEW;
    }

    // Todo: Work in progress.
    @PostMapping({"/search","search"})
    public String suche(@RequestParam("name") String name, Model model) {
        model.addAttribute("gamename", name);
        return VIEW;
    }

    @GetMapping(value = "/search", params = {"name"})
    public String showResults(@RequestParam("name") String name, Model model) {
        GameListDto gameListDto = restTemplate.getForObject("https://api.boardgameatlas.com/api/search?name=" + name + "&client_id=JLBr5npPhV", GameListDto.class);
        model.addAttribute("GameList", gameListDto);
        model.addAttribute("gamename", name);
        return VIEW;
    }
}
