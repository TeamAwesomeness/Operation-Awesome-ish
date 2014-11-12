package com.game.view;

import java.util.Scanner;

public class LoadNewGame {
    
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|        Choose A Save Slot           |"
            + "\n---------------------------------------"
            + "\n1 - [Player Save Slot One]            |"
            + "\nq - Exit to Main Menu                 |"
            + "\n---------------------------------------";
    
    void display() {
        char option = ' ';
        do {
            System.out.println(MENU);
            
            String input = user_input.next();
            option = input.charAt(0);           
            
            this.doAction(option);
            
        } while (option != 'q');//OPTION 6::GO BACK TO MAIN MENU
    }


    private void doAction(char option) {
        
        switch(option) {
         
            case '1': //[SLOT ONE] LOAD SAVED GAME...
                
                System.out.print("Saving in Slot One");
                waitTime(10000);
                System.out.print("\n\nLoading");
                waitTime(25000);
                System.out.print("...");
                waitTime(25000);
                System.out.print("...");
                waitTime(25000);
                System.out.print("...");
                waitTime(25000);
                System.out.print("...");
                waitTime(25000);
                System.out.print("Loaded!");
                /*
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
                */
                GameMapView mapView = new GameMapView();
                mapView.display();
                return;
                
            /*case '2': //[SLOT TWO] LOAD SAVED GAME...
                
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
            */   
            case '6': //GO BACK TO MAIN MENU
                
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
