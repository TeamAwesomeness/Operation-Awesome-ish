package com.game.control;

import com.game.src.Bread;
import com.game.src.Chickens;
import com.game.src.Potions;
import com.game.src.Lives;
/**
 *
 * @author Sterling Grant && Moses Accinelli
 */
// Inventory Control
/*
 * calcMaxWeight(inventoryItem, volume) : double
 * saveBackpackSize(inventoryItem, backpack) : double
 * calcBackpacksNeeded(inventoryItem, backpack, dailyAmountRequired, NoPeople) : long
 * calcBreadNeeded(inventoryItem, noBackpacks) : long
 * calcBreadNeeded(Health) : double
 * calcChickensNeeded(backpack, noBackpacks) : long
 * calcChickensNeeded(Health) : double
 * calcPotionsNeeded(backpack, noBackpacks) : long
 * calcPotionsNeeded(Health) : double
 * calcLivesNeeded(backpack, noBackpacks) : long
 * calcLivesNeeded(Health) : double
 * getAmountToGeneralStore(inventoryItem) : double
 * getInventoryList() : inventoryItems
 * addToInventory(inventoryItem, amount)
 * removeFromInventory(inventoryItem, amount)
*/
public class InventoryControl {
    Bread breadFood = new Bread();
    Chickens chickensFood = new Chickens();
    Potions potionsFood = new Potions();
    Lives lives = new Lives();
    
    public double calcMaxWeight(double inventoryItem, double volume) {
        //Maximum Weight
        if(inventoryItem == 4 && volume >= 9) { //Bread, Chickens, Potions
            System.out.println("\nYou are at a maximum inventory.");
        } else {
            System.out.println("\n\nBread: " + breadFood +
                               "\nChickens: " + chickensFood + 
                               "\nPotions: " + potionsFood);
        }
    
        //Minimum Weight 
        if(inventoryItem == 0) {
            System.out.println("\nYou are at a minimum inventory.");
        } else {
            System.out.println("\n\nBread: " + breadFood +
                               "\nChickens: " + chickensFood + 
                               "\nPotions: " + potionsFood);
        }
        return 0;
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
