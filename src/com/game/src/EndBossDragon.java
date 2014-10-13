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
public class EndBossDragon implements Serializable{
    private static EndBossDragon endboss;
    
    //Class Instance Variables
    public String name;
    public int npcID;

    public EndBossDragon() {
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

    @Override
    public String toString() {
        return "EndBossDragon{" + "name: " + name + ", npcID: " + npcID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.npcID;
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
        final EndBossDragon other = (EndBossDragon) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.npcID != other.npcID) {
            return false;
        }
        return true;
    }
    
    
}
