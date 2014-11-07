package com.game.view;

import java.util.Scanner;

public class LoadNewGame {
    
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|        Choose A Save Slot           |"
            + "\n---------------------------------------"
            + "\n1 - [Player Save Slot One]            |"
            + "\n2 - [Player Save Slot Two]            |"
            + "\n3 - [Player Save Slot Three]          |"
            + "\n4 - [Player Save Slot Four]           |"
            + "\n5 - [Player Save Slot Five]           |"
            + "\n6 - Exit to Main Menu                 |"
            + "\n---------------------------------------";
    
    void display() {//was displayMenu()
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
                System.out.println("Saving in Slot One... ... ...");
                waitTime(45000);
                System.out.println("Loading Game...");
                waitTime(55000);
                System.out.println("Adding clouds...");
                waitTime(45000);
                System.out.println("Killing zombies...");
                waitTime(65000);
                System.out.println("Adding mining nodes...");
                waitTime(45000);
                System.out.println("Deleting chunks...");
                waitTime(55000);
                System.out.println("Creating villages...");
                waitTime(45000);
                System.out.println("Adding forests...");
                waitTime(85000);
                System.out.println("Developing oceans...");
                waitTime(55000);
                System.out.println("Proving Darwin wrong...");
                waitTime(65000);
                System.out.println("Adding color...");
                waitTime(75000);
                System.out.println("Done!");
                waitTime(45000);
                return;
                
            case '2': //[SLOT TWO] LOAD SAVED GAME...
                
                option = 2;
                System.out.println("Loading Slot Two... ... ...");
                waitTime(55000);
                System.out.println("Loading Game...");
                waitTime(45000);
                System.out.println("Adding clouds...");
                waitTime(65000);
                System.out.println("Killing zombies...");
                waitTime(75000);
                System.out.println("Adding mining nodes...");
                waitTime(45000);
                System.out.println("Deleting chunks...");
                waitTime(55000);
                System.out.println("Creating villages...");
                waitTime(65000);
                System.out.println("Adding forests...");
                waitTime(45000);
                System.out.println("Developing oceans...");
                waitTime(55000);
                System.out.println("Proving Darwin wrong...");
                waitTime(85000);
                System.out.println("Adding color...");
                waitTime(75000);
                System.out.println("Done!");
                waitTime(45000);
                return;
            
            case '3': //[SLOT THREE] LOAD SAVED GAME...
                
                option = 3;
                System.out.println("Loading Slot Three... ... ...");
                waitTime(65000);
                System.out.println("Loading Game...");
                waitTime(55000);
                System.out.println("Adding clouds...");
                waitTime(45000);
                System.out.println("Killing zombies...");
                waitTime(65000);
                System.out.println("Adding mining nodes...");
                waitTime(45000);
                System.out.println("Deleting chunks...");
                waitTime(55000);
                System.out.println("Creating villages...");
                waitTime(45000);
                System.out.println("Adding forests...");
                waitTime(85000);
                System.out.println("Developing oceans...");
                waitTime(55000);
                System.out.println("Proving Darwin wrong...");
                waitTime(65000);
                System.out.println("Adding color...");
                waitTime(75000);
                System.out.println("Done!");
                waitTime(45000);
                return;
                
            case '4': //[SLOT FOUR] LOAD SAVED GAME...
                
                option = 4;
                System.out.println("Loading Slot Four... ... ...");
                waitTime(45000);
                System.out.println("Loading Game...");
                waitTime(55000);
                System.out.println("Adding clouds...");
                waitTime(45000);
                System.out.println("Killing zombies...");
                waitTime(65000);
                System.out.println("Adding mining nodes...");
                waitTime(45000);
                System.out.println("Deleting chunks...");
                waitTime(55000);
                System.out.println("Creating villages...");
                waitTime(45000);
                System.out.println("Adding forests...");
                waitTime(35000);
                System.out.println("Developing oceans...");
                waitTime(55000);
                System.out.println("Proving Darwin wrong...");
                waitTime(65000);
                System.out.println("Adding color...");
                waitTime(75000);
                System.out.println("Done!");
                waitTime(45000);
                return;
                
            case '5': //[SLOT FIVE] LOAD SAVED GAME...
                
                option = 5;
                System.out.println("Loading Slot Five... ... ...");
                waitTime(55000);
                System.out.println("Loading Game...");
                waitTime(45000);
                System.out.println("Adding clouds...");
                waitTime(65000);
                System.out.println("Killing zombies...");
                waitTime(75000);
                System.out.println("Adding mining nodes...");
                waitTime(45000);
                System.out.println("Deleting chunks...");
                waitTime(55000);
                System.out.println("Creating villages...");
                waitTime(65000);
                System.out.println("Adding forests...");
                waitTime(45000);
                System.out.println("Developing oceans...");
                waitTime(55000);
                System.out.println("Proving Darwin wrong...");
                waitTime(85000);
                System.out.println("Adding color...");
                waitTime(75000);
                System.out.println("Done!");
                waitTime(45000);
                return;
                
            case '6': //GO BACK TO MAIN MENU
                
                option = 6;
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();//was displayMenu()
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }
    public static void waitTime(long millisecond) {
        long max = millisecond;
        for(long i = 0; i < max; i++) {
            for(long j = 0; j < max; j++) {}
        }
    }
}
