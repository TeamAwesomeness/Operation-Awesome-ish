package com.game.view;

import java.util.Scanner;

public class OptionsMenuView {

    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|              Options                |"
            + "\n---------------------------------------"
            + "\n1 - Fullscreen                        |"
            + "\n2 - Sound                             |"
            + "\n3 - Color                             |"
            + "\n4 - Back to Main Menu                 |"
            + "\n---------------------------------------";
    
    void display() {//was displayMenu()
        char option = ' ';
        do {
            System.out.println(MENU);           //display the main menu
            
            String input = user_input.next();   //String input = this.getInput();  get the user's selection
            option = input.charAt(0);           
            
            this.doAction(option);           //do action based on selection
            
        } while (option != '4');             //THIS NUMBER MUST MATCH THE LAST NUMBER YOU CHOOSE
    }


    private void doAction(char option) {
        
        switch(option) {
         
            case '1': //MENU OPTION [1]:: FULLSCREEN
                
                option = 1;
                System.out.println("The screen is now in a very tiny window!");
                return;
                
            case '2': //MENU OPTION [2]:: SOUND
                
                option = 2;
                System.out.println("The sound is now off!");
                return;
                
            case '3': //MENU OPTION [3]:: COLOR
                
                option = 3;
                System.out.println("You've turned off the color, "
                                 + "\nnow it's all black and white!");
                return;
                
            case '4': //MENU OPTION [4]:: GO BACK TO MAIN MENU
                
                option = 4;
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display(); //was displayMenu()
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }

    
    
}