package com.noghli.moodfinder.moodfinder_core.model;

public enum Mood {
    Happy("hppy", "Happy"),
    Sad("sd", "Sad");
    
    String id;
    String caption;
    
    private Mood(String id, String caption) {
        this.id = id;
        this.caption = caption;
    }
}
