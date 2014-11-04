package com.game.view;

import java.util.Scanner;

public class LoadExistingGame {
    
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|            Saved Games              |"
            + "\n---------------------------------------"
            + "\n1 - [Player Save Slot One]            |"
            + "\n2 - [Player Save Slot Two]            |"
            + "\n3 - [Player Save Slot Three]          |"
            + "\n4 - [Player Save Slot Four]           |"
            + "\n5 - [Player Save Slot Five]           |"
            + "\n6 - Exit to Main Menu                 |"
            + "\n---------------------------------------";
    
    void displayMenu() {
        char option = ' ';
        do {
            System.out.println(MENU);           //display the main menu
            
            String input = user_input.next();   //String input = this.getInput();  get the user's selection
            option = input.charAt(0);           
            
            this.doAction(option);           //do action based on selection
            
        } while (option != '6');             //OPTION 6::GO BACK TO MAIN MENU
    }


    private void doAction(char option) {
        
        switch(option) {
         
            case '1': //[SLOT ONE] LOAD SAVED GAME...
                
                option = 1;
                System.out.println("Loading Slot One... ... ...");
                return;
                
            case '2': //[SLOT TWO] LOAD SAVED GAME...
                
                option = 2;
                System.out.println("Loading Slot Two... ... ...");
                return;
            
            case '3': //[SLOT THREE] LOAD SAVED GAME...
                
                option = 3;
                System.out.println("Loading Slot Three... ... ...");
                return;
                
            case '4': //[SLOT FOUR] LOAD SAVED GAME...
                
                option = 4;
                System.out.println("Loading Slot Four... ... ...");
                return;
                
            case '5': //[SLOT FIVE] LOAD SAVED GAME...
                
                option = 5;
                System.out.println("Loading Slot Five... ... ...");
                return;
                
            case '6': //GO BACK TO MAIN MENU
                
                option = 6;
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMenu();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }
}
