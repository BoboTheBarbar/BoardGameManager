package com.boardgame.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    RestTemplate restTemplate;
    private Logger log = LoggerFactory.getLogger(Bootstrap.class);

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Override
    public void run(String... args) throws Exception {
//        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        Games games = restTemplate.getForObject("https://api.boardgameatlas.com/api/search?name=Exploding Kittens&client_id=JLBr5npPhV", Games.class);
        log.info(String.valueOf(games.getGames().size()));
        for(Game game : games.getGames()) {
            log.info(game.getName());
        }
        //        log.info(quote.toString());
    }
}
