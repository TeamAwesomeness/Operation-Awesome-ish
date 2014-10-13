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
public class Chickens implements Serializable{
    private static Chickens chickensFood;
    
    //Class Instance Variables
    public String name;
    public int itemID;
    public int healingAmt;
    public double min;
    public double max;

    public Chickens() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getHealingAmt() {
        return healingAmt;
    }

    public void setHealingAmt(int healingAmt) {
        this.healingAmt = healingAmt;
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
        return "Chickens{" + "name: " + name + ", itemID: " + itemID + ", healingAmt: " + healingAmt + ", min: " + min + ", max: " + max + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.itemID;
        hash = 23 * hash + this.healingAmt;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.min) ^ (Double.doubleToLongBits(this.min) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.max) ^ (Double.doubleToLongBits(this.max) >>> 32));
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
        final Chickens other = (Chickens) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.itemID != other.itemID) {
            return false;
        }
        if (this.healingAmt != other.healingAmt) {
            return false;
        }
        if (Double.doubleToLongBits(this.min) != Double.doubleToLongBits(other.min)) {
            return false;
        }
        return true;
    }
    
    
}
