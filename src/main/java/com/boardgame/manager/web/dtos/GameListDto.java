package com.boardgame.manager.web.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class GameListDto {
    ArrayList<Game> games = new ArrayList <Game> ();
}
