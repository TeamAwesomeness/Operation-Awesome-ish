package com.game.model;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

    // class instance variables
    
    private String name;
   // private double bestTime;

    public Player() {
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

    
}
