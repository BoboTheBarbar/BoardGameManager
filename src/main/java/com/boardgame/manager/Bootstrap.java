package com.boardgame.manager;

import com.boardgame.manager.responseDtos.Game;
import com.boardgame.manager.responseDtos.GameListDto;
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
    public void run(String... args) {
        String gameName = "Exploding Kittens";
        GameListDto gameListDto = restTemplate.getForObject("https://api.boardgameatlas.com/api/search?name=" + gameName + "&client_id=JLBr5npPhV", GameListDto.class);
        log.info(String.valueOf(gameListDto.getGames().size()));
        for(Game game : gameListDto.getGames()) {
            log.info(game.getName());
        }
    }
}
