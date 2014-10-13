/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.src;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Moses
 */
public class KingdomValley implements Serializable{
    public static KingdomValley valley;
    
    //Class Instance Variables
    private String name;
    private int locationID;

    public KingdomValley() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    @Override
    public String toString() {
        return "KingdomValley{" + "name: " + name + ", locationID: " + locationID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.locationID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KingdomValley other = (KingdomValley) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.locationID != other.locationID) {
            return false;
        }
        return true;
    }
    
    
}
