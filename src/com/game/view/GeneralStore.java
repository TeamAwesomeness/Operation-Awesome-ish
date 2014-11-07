package com.game.view;

import com.game.control.InventoryControl;
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
            + "\n5 - Exit to Main Menu                 |"
            + "\n=======================================";
    
    void display() { //was displayMenu()
        char option = ' ';
        do {
            System.out.println(STORE);           //display the main menu
            
            String input = user_input.next();   //String input = this.getInput();  get the user's selection
            option = input.charAt(0);           
            
            this.doAction(option);           //do action based on selection
            
        } while (option != '5');             //THIS NUMBER MUST MATCH THE LAST NUMBER YOU CHOOSE
    }
    
    private void doAction(char option) {
        
        switch(option) {
            
            case '1': //create and start a new game
                
                option = 1;
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Moldy Bread"
                                 + "\nfor 5XP.");
                break;
                
            case '2': //load an existing game
                
                option = 2;
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Slimy Chicken for"
                                  +"\n7XP.");
                break;
                
            case '3': //display the options menu
                
                option = 3;
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Potions of Health for"
                                  +"\n10XP.");
                break;
                
            case '4': //display the help menu
                
                option = 4;
                System.out.println("\n\n");
                System.out.println("You've purchased [1] Extra Life"
                                 + "\nfor 30XP.");
                break;
                
            case '5': //exit the game
                
                option = 5;
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();//was displayMenu()
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }

}
