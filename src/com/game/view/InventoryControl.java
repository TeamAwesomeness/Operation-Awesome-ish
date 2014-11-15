package com.game.view;

import com.game.src.Bread;
import com.game.src.Chickens;
import com.game.src.Experience;
import com.game.src.Level;
import com.game.src.Potions;
import com.game.src.Lives;
import com.game.src.Spheres;
import java.util.Scanner;

// Inventory Control
// Redid Inventory Control November 15 2014
public class InventoryControl { //Start
    Bread breadFood = new Bread();
    Chickens chickensFood = new Chickens();
    Potions potionsFood = new Potions();
    Lives lives = new Lives();
    Spheres spheres = new Spheres();
    Experience xp = new Experience();
    Level lvl = new Level();
    
    Scanner user_input = new Scanner(System.in);

    private final String inventory = "\n"
            + "\n\t---------------------------------------"
            + "\n\t-             Inventory               -"
            + "\n\t---------------------------------------"
            + "\n\t- Level: " + lvl + ""
            + "\n\t---------------------------------------"
            + "\n\t- Moldy Bread: " + breadFood
            + "\n\t- Slimy Chicken: " + chickensFood
            + "\n\t- Potion of Health: " + potionsFood
            + "\n\t- Extra Lives: " + lives
            + "\n\t---------------------------------------"
            + "\n\t- Experience: " + xp
            + "\n\t- Magical Spheres: " + spheres
            + "\n\t---------------------------------------"
            + "\n\tq - Go to the Map                     |"
            + "\n\t---------------------------------------";
    
    void display() {
        char option = ' ';
        do {
            System.out.println(inventory);
            
            String input = user_input.next();
            option = input.charAt(0);
            
            this.doAction(option);
            
        } while (option != 'q'); //THIS NUMBER MUST MATCH THE LAST NUMBER YOU CHOOSE
    }
    
    private void doAction(char option) {
        
        switch(option) {
            
            case 'q': //Go to the Map
                
                GameMapView mapView = new GameMapView();
                mapView.display();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;

        }//end switch
        
    }//End doAction
    
}//End
