package com.boardgame.manager.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GameDomain {
    final private String id;
    final private String name;
    private String url;
    private String price;
    private String price_ca;
    private String price_uk;
    private float min_players;
    private float max_players;
    private float min_playtime;
    private float max_playtime;
    private float min_age;
    private String description;
    private String commentary;
    private String thumb_url;
    private String image_url;
    private String publisher;
    private String rules_url;
    private float year_published;
    private String price_text;
}
