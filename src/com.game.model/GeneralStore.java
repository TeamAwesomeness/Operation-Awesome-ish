package com.game;

import com.game.view.GameMapView;
import java.util.Scanner;

public class GeneralStore {
    
    Scanner user_input = new Scanner(System.in);

    private final String STORE = "\n"
            + "\n======================================="
            + "\n|  XP: 11                             |"
            + "\n======================================="
            + "\n|          The General Store          |"
            + "\n======================================="
            + "\n1 - Moldy Bread               @5XP    |"
            + "\n2 - Slimy Chicken             @7XP    |"
            + "\n3 - Potions of Health         @10XP   |"
            + "\n4 - Extra Life                @30XP   |"
            + "\nq - Exit to Map                       |"
            + "\n=======================================";
    
    void display() {
        char option = ' ';
        do {
            System.out.println(STORE);
            
            String input = user_input.next();
            option = input.charAt(0);           
            
            this.doAction(option);
            
        } while (option != 'q'); //THIS NUMBER MUST MATCH THE LAST NUMBER YOU CHOOSE
    }
    
    private void doAction(char option) {
        
        switch(option) {
            
            case '1': //create and start a new game
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Moldy Bread"
                                 + "\nfor 5XP.");
                break;
                
            case '2': //load an existing game
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Slimy Chicken for"
                                  +"\n7XP.");
                break;
                
            case '3': //display the options menu
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Potions of Health for"
                                  +"\n10XP.");
                break;
                
            case '4': //display the help menu
                
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Extra Life"
                                 + "\nfor 30XP.");
                break;
                
            case 'q': //exit to in-game Map View
                
                GameMapView mapView = new GameMapView();
                mapView.display();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }

}
