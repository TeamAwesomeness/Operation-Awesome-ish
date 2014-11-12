package com.game.view;

import java.util.Scanner;

public class LoadExistingGame {
    
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|            Saved Games              |"
            + "\n---------------------------------------"
            + "\n1 - [Player Save Slot One]            |"
            + "\n6 - Exit to Main Menu                 |"
            + "\n---------------------------------------";
    
    void display() {
        char option = ' ';
        do {
            System.out.println(MENU);
            
            String input = user_input.next();
            option = input.charAt(0);           
            
            this.doAction(option);
            
        } while (option != '6'); //OPTION 6::GO BACK TO MAIN MENU
    }


    private void doAction(char option) {
        
        switch(option) {
         
            case '1': //[SLOT ONE] LOAD SAVED GAME...
                
                System.out.println("Loading Slot One... ... ...");
                return;
                
            /*   
            case '2': //[SLOT TWO] LOAD SAVED GAME...
                
                System.out.println("Loading Slot Two... ... ...");
                return;
            
            case '3': //[SLOT THREE] LOAD SAVED GAME...
                
                System.out.println("Loading Slot Three... ... ...");
                return;
                
            case '4': //[SLOT FOUR] LOAD SAVED GAME...
                
                System.out.println("Loading Slot Four... ... ...");
                return;
                
            case '5': //[SLOT FIVE] LOAD SAVED GAME...
                
                System.out.println("Loading Slot Five... ... ...");
                return;
            */   
            case 'q': //GO BACK TO MAIN MENU
                
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }
}
