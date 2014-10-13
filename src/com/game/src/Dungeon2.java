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
 * @author Sylbhann
 */
public class Dungeon2 implements Serializable {
    public static Dungeon2 dungeonTwo;
    
    //Class Instance Variables
    private String name;
    private int locationID;
    private int enemyID;

    public Dungeon2() {
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

    public int getEnemyID() {
        return enemyID;
    }

    public void setEnemyID(int enemyID) {
        this.enemyID = enemyID;
    }

    @Override
    public String toString() {
        return "Dungeon2{" + "name=" + name + ", locationID=" + locationID + ", enemyID=" + enemyID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.locationID;
        hash = 37 * hash + this.enemyID;
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
        final Dungeon2 other = (Dungeon2) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.locationID != other.locationID) {
            return false;
        }
        if (this.enemyID != other.enemyID) {
            return false;
        }
        return true;
    }
    
    

    
}
