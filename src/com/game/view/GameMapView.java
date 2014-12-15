package com.game.view;

import com.game.DungeonView3;
import com.game.Kingdom;
import com.game.DungeonView2;
import com.game.DungeonView1;
import com.game.GeneralStore;
import java.io.Serializable;
import java.util.Scanner;

public class GameMapView implements Serializable {
    
    Scanner user_input = new Scanner(System.in);

    private final String MAP = "\n"
            + "\n---------------------------------------"
            + "\n    Map                               |"
            + "\n---------------------------------------"
            + "\n1 - Go to the Kingdom                 |"
            + "\n2 - Go to the General Store           |"
            + "\n3 - Go to the Icy Caves               |"
            + "\n4 - Go to the Fiery Depths            |"
            + "\n5 - Go to the Spooky Hollow           |"
            + "\n6 - Inventory                         |"
            + "\ns - Save                              |"
            + "\nq - Exit to Main Menu                 |"
            + "\n---------------------------------------";
    
    void display() {
        char option = ' ';
        do {
            System.out.println(MAP);
            
            String input = user_input.next();
            option = input.charAt(0);
            
            this.doAction(option);
            
        } while (option != 'q'); //THIS NUMBER MUST MATCH THE LAST NUMBER YOU CHOOSE
    }
    
    private void doAction(char option) {
        
        switch(option) {
            
            case '1': //Go to the Kingdom
                
                Kingdom castle = new Kingdom();
                castle.display();
                break;
                
            case '2': //Go to the General Store
                
                GeneralStore genStore = new GeneralStore();
                genStore.display();
                break;
                
            case '3': //Go to the Icy Caves
                
                DungeonView1 dungeon1 = new DungeonView1();
                dungeon1.display();
                break;
                
            case '4': //Go to the Fiery Depths
                
                DungeonView2 dungeon2 = new DungeonView2();
                dungeon2.display();
                break;
                
            case '5': //Go to the Spooky Hollow
                
                DungeonView3 dungeon3 = new DungeonView3();
                dungeon3.display();
                return;
                
            case '6': //Inventory
                
                com.game.InventoryControl inventory = new com.game.InventoryControl();
                inventory.display();
                return;
                
            /*
            case '7': //Help
                
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                return;
                
            case '8': //Options
                
                OptionsMenuView optionsMenu = new OptionsMenuView();
                optionsMenu.display();
                return;
            */    
            case 's': //Save Game
                
                System.out.println("Game Saved!");
                return;
                
            case 'q': //Exit to Main Menu
                
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }

    public void displayMenu() {
        System.out.println("If you see this, this is the displayMenu(). Not the GameMapView.");
    }

}