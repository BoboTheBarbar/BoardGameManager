package com.boardgame.manager.responseDtos;

public class Images {
    private String thumb;
    private String small;
    private String medium;
    private String large;
    private String original;


    // Getter Methods

    public String getThumb() {
        return thumb;
    }

    public String getSmall() {
        return small;
    }

    public String getMedium() {
        return medium;
    }

    public String getLarge() {
        return large;
    }

    public String getOriginal() {
        return original;
    }

    // Setter Methods

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public void setOriginal(String original) {
        this.original = original;
    }
}
