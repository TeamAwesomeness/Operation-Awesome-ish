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
public class GeneralStore implements Serializable {
    public static GeneralStore merchantOne;
    
    //Class Instance Variables
    private String name;
    private int locationID;
    private int itemID;
    private double itemAmt;

    public GeneralStore() {
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

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public double getItemAmt() {
        return itemAmt;
    }

    public void setItemAmt(double itemAmt) {
        this.itemAmt = itemAmt;
    }

    @Override
    public String toString() {
        return "GeneralStore{" + "name=" + name + ", locationID=" + locationID + ", itemID=" + itemID + ", itemAmt=" + itemAmt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.locationID;
        hash = 29 * hash + this.itemID;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.itemAmt) ^ (Double.doubleToLongBits(this.itemAmt) >>> 32));
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
        final GeneralStore other = (GeneralStore) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.locationID != other.locationID) {
            return false;
        }
        if (this.itemID != other.itemID) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemAmt) != Double.doubleToLongBits(other.itemAmt)) {
            return false;
        }
        return true;
    }
    
    
    
}
