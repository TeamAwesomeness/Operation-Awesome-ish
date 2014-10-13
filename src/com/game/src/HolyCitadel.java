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
public class HolyCitadel implements Serializable{
    private static HolyCitadel citadel;
    
    //Class Instance Variables
    public int enemyID;
    public int npcID;
    public int locationID;
    public String name;

    public HolyCitadel() {
    }
    
    

    public int getEnemyID() {
        return enemyID;
    }

    public void setEnemyID(int enemyID) {
        this.enemyID = enemyID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HolyCitadel{" + "enemyID: " + enemyID + ", npcID: " + npcID + ", locationID: " + locationID + ", name: " + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.enemyID;
        hash = 89 * hash + this.npcID;
        hash = 89 * hash + this.locationID;
        hash = 89 * hash + Objects.hashCode(this.name);
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
        final HolyCitadel other = (HolyCitadel) obj;
        if (this.enemyID != other.enemyID) {
            return false;
        }
        if (this.npcID != other.npcID) {
            return false;
        }
        if (this.locationID != other.locationID) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
