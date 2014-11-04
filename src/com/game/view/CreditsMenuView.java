package com.game.view;

import java.util.Scanner;

public class CreditsMenuView {
    
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|       WELCOME TO THE CREDITS        |"
            + "\n---------------------------------------"
            + "\n|     [DR]  Sterling Grant            |"
            + "\n|  DR Grant doesn't have a bio yet.   |"
            + "\n---------------------------------------"
            + "\n|      [MR]  Moses Accinelli          |"
            + "\n| Moses has led a life in the criminal|"
            + "\n| underground most of his life, owning|"
            + "\n| a toyota pickup truck that's been   |"
            + "\n| punked out. He's a sugar momma daddy|"
            + "\n| and loves all that glitters. Today, |"
            + "\n| he spends most of his time chilling |"
            + "\n| with his mates, kicking down trash  |"
            + "\n| cans with his siblings or out in the|"
            + "\n| back alley with his .22.            |"
            + "\n---------------------------------------"
            + "\n1 - Exit to Main Menu                 |"
            + "\n---------------------------------------";
    
    void displayMenu() {
        char option = ' ';
        do {
            System.out.println(MENU);           //display the main menu
            
            String input = user_input.next();   //String input = this.getInput();  get the user's selection
            option = input.charAt(0);           
            
            this.doAction(option);           //do action based on selection
            
        } while (option != '2');             //the selection is not "exit"
    }


    private void doAction(char option) {
        
        switch(option) {
         
            case '1': //Go Back to Main Menu
                
                option = 1;
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMenu();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }
}
