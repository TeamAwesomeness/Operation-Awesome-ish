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
public class Bread implements Serializable {
    public static Bread breadFood;
    
    //Class Instance Variables
    private String name;
    private double min;
    private double max;
    private int itemID;
    private int healingAmt;

    public Bread() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Bread{" + "name=" + name + ", min=" + min + ", max=" + max + ", itemID=" + itemID + ", healingAmt=" + healingAmt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.min) ^ (Double.doubleToLongBits(this.min) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.max) ^ (Double.doubleToLongBits(this.max) >>> 32));
        hash = 41 * hash + this.itemID;
        hash = 41 * hash + this.healingAmt;
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
        final Bread other = (Bread) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.min) != Double.doubleToLongBits(other.min)) {
            return false;
        }
        if (Double.doubleToLongBits(this.max) != Double.doubleToLongBits(other.max)) {
            return false;
        }
        if (this.itemID != other.itemID) {
            return false;
        }
        if (this.healingAmt != other.healingAmt) {
            return false;
        }
        return true;
    }
    
    
    
}
