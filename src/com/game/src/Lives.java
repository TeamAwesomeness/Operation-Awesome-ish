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
public class Lives implements Serializable {
    public static Lives lives;
    
    //Class Instance Variables
    private String name;
    private int itemID;
    private double min;
    private double max;

    public Lives() {
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
        return "Lives{" + "name=" + name + ", itemID=" + itemID + ", min=" + min + ", max=" + max + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.itemID;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.min) ^ (Double.doubleToLongBits(this.min) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.max) ^ (Double.doubleToLongBits(this.max) >>> 32));
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
        final Lives other = (Lives) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.itemID != other.itemID) {
            return false;
        }
        if (Double.doubleToLongBits(this.max) != Double.doubleToLongBits(other.max)) {
            return false;
        }
        return true;
    }
    
    
    
}
