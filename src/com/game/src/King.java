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
public class King implements Serializable {
    public static King kingNPC;
    
    //Class Instance Variables
    private String name;
    private int npcID;

    public King() {
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
        return "King{" + "name: " + name + ", npcID: " + npcID + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.npcID;
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
        final King other = (King) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.npcID != other.npcID) {
            return false;
        }
        return true;
    }
    
    
    
}
