package com.game.view;

import com.game.main.CuriousWorkmanship;
import java.awt.Point;
import java.io.Serializable;

public class Map implements Serializable {

    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map(int row, int column) {
        if (row < 1 || column < 1){
            System.out.println("Be mindful! Rows and Columns are greater than zero (>)");
            return;
        }
        
        this.rowCount = row;
        this.columnCount = column;
        
        this.locations = new Location[rowCount][columnCount];
        
        for (int rowCount = 0; rowCount < row; rowCount++) {
            Location location = new Location();
            location.setColumn(columnCount);
            location.setRow(rowCount);
            location.setVisited(false);
            
            locations[rowCount][columnCount] = location;           
        }
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.rowCount;
        hash = 13 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    int getNoOfRows() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getNoOfColumns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

} //End