package com.game;

import com.game.MapControl;
import com.game.MapControlException;
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
    
    public static int moveActorsToStartLocation(Map map) throws MapControlException {
        
        Actor[] actors = Actor.values();
        // for every actor
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
        }
        return 0;
    }
    
    public boolean doAction(String choice) {
        Actor actor = null;
        //move actor to specified location
        try {
            MapControl.moveActorToLocation(actor, coordinates);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
        return false;
    }
}

