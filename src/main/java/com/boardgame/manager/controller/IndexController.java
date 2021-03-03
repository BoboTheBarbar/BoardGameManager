package com.boardgame.manager.controller;

import com.boardgame.manager.responseDtos.GameListDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
@Slf4j
@RequestMapping(value = "/index")
public class IndexController {

    private static final String VIEW = "index";

    RestTemplate restTemplate;
    RestTemplateBuilder restTemplateBuilder;

    public IndexController(RestTemplate restTemplate, RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplate;
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @GetMapping
    public String getIndexPage(Model model) {
        log.info("requesting index page...");
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
