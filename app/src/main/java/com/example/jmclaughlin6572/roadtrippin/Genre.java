package com.example.jmclaughlin6572.roadtrippin;

/**
 * Created by Joe on 2017-12-06.
 */

public class Genre {

    private int id;
    private String name;
    private String description;

    public Genre(){}

     public Genre(int id, String name, String description){
        this.id = id;
        this.name = name;
         this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
