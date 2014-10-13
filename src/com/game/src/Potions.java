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
public class Potions implements Serializable{
    private static Potions potionsFood;
    
    //Class Instance Variables
    public String name;
    public int healingAmt;
    public int itemID;
    public double min;
    public double max;

    public Potions() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealingAmt() {
        return healingAmt;
    }

    public void setHealingAmt(int healingAmt) {
        this.healingAmt = healingAmt;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Potions{" + "name: " + name + ", healingAmt: " + healingAmt + ", itemID: " + itemID + ", min: " + min + ", max: " + max + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.healingAmt;
        hash = 89 * hash + this.itemID;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.min) ^ (Double.doubleToLongBits(this.min) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.max) ^ (Double.doubleToLongBits(this.max) >>> 32));
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
        final Potions other = (Potions) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.healingAmt != other.healingAmt) {
            return false;
        }
        if (this.itemID != other.itemID) {
            return false;
        }
        if (Double.doubleToLongBits(this.min) != Double.doubleToLongBits(other.min)) {
            return false;
        }
        if (Double.doubleToLongBits(this.max) != Double.doubleToLongBits(other.max)) {
            return false;
        }
        return true;
    }
    
    
}
