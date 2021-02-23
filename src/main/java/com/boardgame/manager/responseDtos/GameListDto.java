package com.boardgame.manager.responseDtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class GameListDto {
    ArrayList<Game> games = new ArrayList <> ();
}
