package com.game.view;

import com.game.main.CuriousWorkmanship;
import com.sun.org.apache.bcel.internal.Constants;
import javafx.scene.Scene;

public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        CuriousWorkmanship.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Item[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
    }
    
    private static Item[] createInventoryList() {
        // created array(list) of items
        Item[] inventory = 
                new Item[6];
        
        Item breadFood = new Item();
        breadFood.setDescription("Moldy Bread");
        breadFood.setQuantityInStock(0);
        breadFood.setRequiredAmount(0);
        inventory[Item.breadFood.ordinal()] = breadFood;
       
 
        Item chickensFood = new Item();
        chickensFood.setDescription("Slimy Chicken");
        chickensFood.setQuantityInStock(0);
        chickensFood.setRequiredAmount(0);
        inventory[Item.chickensFood.ordinal()] = chickensFood;
       
 
        Item potionsFood = new Item();
        potionsFood.setDescription("Potion of Health");
        potionsFood.setQuantityInStock(0);
        potionsFood.setRequiredAmount(0);
        inventory[Item.potionsFood.ordinal()] = potionsFood;
       
 
        Item lives = new Item();
        lives.setDescription("Extra Lives");
        lives.setQuantityInStock(0);
        lives.setRequiredAmount(0);
        inventory[Item.lives.ordinal()] = lives;
       
 
        Item xp = new Item();
        xp.setDescription("Experience");
        xp.setQuantityInStock(0);
        xp.setRequiredAmount(0);
        inventory[Item.xp.ordinal()] = xp;
       
 
        Item spheres = new Item();
        spheres.setDescription("Magical Spheres");
        spheres.setQuantityInStock(0);
        spheres.setRequiredAmount(0);
        inventory[Item.spheres.ordinal()] = spheres;
        
        return inventory;
    }
        
    static void assignScenesToLocations(Map map, com.game.main.CuriousWorkmanship.Scene[] scenes) {
        System.out.println("Scene Location");
    }

    static void assignScenesToLocations(Map map, com.game.view.Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum InventoryItem {
        breadFood,
        chickensFood,
        potionsFood,
        lives,
        xp,
        spheres;
    }

}
