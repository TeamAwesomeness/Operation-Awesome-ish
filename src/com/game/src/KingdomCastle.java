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
public class KingdomCastle implements Serializable {
    public static KingdomCastle castle;
    
    //Class Instance Variables
    private String name;
    private int npcID;
    private int locationID;

    public KingdomCastle() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNpcID() {
        return npcID;
    }

    public void setNpcID(int npcID) {
        this.npcID = npcID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    @Override
    public String toString() {
        return "KingdomCastle{" + "name: " + name + ", npcID:" + npcID + ", locationID: " + locationID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.npcID;
        hash = 29 * hash + this.locationID;
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
        final KingdomCastle other = (KingdomCastle) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.npcID != other.npcID) {
            return false;
        }
        if (this.locationID != other.locationID) {
            return false;
        }
        return true;
    }
    
    
}
