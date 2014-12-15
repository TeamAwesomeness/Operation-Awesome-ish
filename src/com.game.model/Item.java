package com.game;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {
    static Object breadFood;
    static Object chickensFood;
    static Object potionsFood;
    static Object lives;
    static Object xp;
    static Object spheres;
    
    private String type;
    private String description;
    private String specialAbility;
    private int requiredAmount;
    private int actualAmount;

    public Item() {
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public int getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(int actualAmount) {
        this.actualAmount = actualAmount;
    }

    @Override
    public String toString() {
        return "Item{" + "type=" + type + ", description=" + description + ", specialAbility=" + specialAbility + ", requiredAmount=" + requiredAmount + ", actualAmount=" + actualAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.specialAbility);
        hash = 79 * hash + this.requiredAmount;
        hash = 79 * hash + this.actualAmount;
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.specialAbility, other.specialAbility)) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (this.actualAmount != other.actualAmount) {
            return false;
        }
        return true;
    }

    void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}