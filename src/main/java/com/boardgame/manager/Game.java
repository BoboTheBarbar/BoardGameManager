package com.boardgame.manager;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Game {
    private String id;
    private String name;
    private String handle;
    private String url;
    private String price;
    private String price_ca;
    private String price_uk;
    private float msrp;
    ArrayList< Object > msrps = new ArrayList < Object > ();
    private String discount;
    private float min_players;
    private float max_players;
    private float min_playtime;
    private float max_playtime;
    private float min_age;
    private String description;
    private String commentary;
    private String thumb_url;
    private String image_url;
    private String matches_specs = null;
    ArrayList < Object > specs = new ArrayList < Object > ();
    ArrayList < Object > mechanics = new ArrayList < Object > ();
    ArrayList < Object > categories = new ArrayList < Object > ();
    ArrayList < Object > developers = new ArrayList < Object > ();
    ArrayList < Object > artists = new ArrayList < Object > ();
    ArrayList < Object > designers = new ArrayList < Object > ();
    ArrayList < Object > publishers = new ArrayList < Object > ();
    Primary_publisher Primary_publisherObject;
    Primary_designer Primary_designerObject;
    ArrayList < Object > names = new ArrayList < Object > ();
    ArrayList < Object > tags = new ArrayList < Object > ();
    private String publisher;
    private String rules_url;
    private float reddit_count;
    private float amazon_rank;
    private String official_url;
    private float comment_count;
    private float num_user_ratings;
    private float average_user_rating;
    private boolean active;
    private float bgg_id;
    private float num_user_complexity_votes;
    private float average_learning_complexity;
    private float average_strategy_complexity;
    private float visits;
    private float lists;
    private float plays;
    private float mentions;
    private float links;
    private float rank;
    private String type;
    private float trending_rank;
    private float listing_clicks;
    private boolean is_historical_low;
    private float year_published;
    private String price_text;
    Images ImagesObject;
    private String description_preview;


    // Getter Methods

    public Primary_publisher getPrimary_publisher() {
        return Primary_publisherObject;
    }

    public Primary_designer getPrimary_designer() {
        return Primary_designerObject;
    }

    public Images getImages() {
        return ImagesObject;
    }

    // Setter Methods

    public void setPrimary_publisher(Primary_publisher primary_publisherObject) {
        this.Primary_publisherObject = primary_publisherObject;
    }

    public void setPrimary_designer(Primary_designer primary_designerObject) {
        this.Primary_designerObject = primary_designerObject;
    }

    public void setImages(Images imagesObject) {
        this.ImagesObject = imagesObject;
    }

}

