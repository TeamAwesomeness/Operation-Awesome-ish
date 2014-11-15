package com.game.src;

import java.io.Serializable;
import java.util.Objects;

public class Level implements Serializable {
    public static Level lvl;
    int xp = 338;
    
    //Class Instance Variables
    private String name;
    private double min;
    private double max;

    public Level() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.min) ^ (Double.doubleToLongBits(this.min) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.max) ^ (Double.doubleToLongBits(this.max) >>> 32));
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
        final Level other = (Level) obj;
        if (!Objects.equals(this.name, other.name)) {
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

    @Override
    public String toString() {
        if (xp <= 25) {
            return "1";
        }else if (xp <= 50 ) {
            return "2";
        }else if (xp <= 125) {
            return "3";
        }else if (xp <= 250) {
            return "4";
        }else if (xp <= 400) {
            return "5";
        }else if (xp <= 700) {
            return "6";
        }else if (xp <= 895) {
            return "7";
        }else if (xp <= 1050) {
            return "8";
        }else if (xp <= 1400) {
            return "9";
        }else if (xp <= 2000) {
            return "10";
        }
        return "0";
    
    }
    
}
