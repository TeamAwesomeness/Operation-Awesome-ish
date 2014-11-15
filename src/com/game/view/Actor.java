package com.game.view;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

public enum Actor implements Serializable {
    
    Jeffrey("He is the king of the kingdom."),
    Guard("These fine folk provide useful tips in the game."),
    Takruk("Villagers worst nightmare, the black dragon."),
    Eevo("The General Store seller.");
    
    private final String description;
    private final Point coordinates;
    
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String setDescription() {
        return description;
    }
    
    public Point getCoordinates() {
        return coordinates;
    }
}