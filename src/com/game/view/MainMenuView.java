package com.game.view;

import java.util.Scanner;

public class MainMenuView {
    
    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|       WELCOME TO THE MAIN MENU      |"
            + "\n---------------------------------------"
            + "\n1 - New Game                          |"
            + "\n2 - Load Game                         |"
            + "\n3 - Options                           |"
            + "\n4 - Help                              |"
            + "\n5 - Credits                           |"
            + "\n0 - TEST: General Store               |"
            + "\n6 - Exit to Desktop                   |"
            + "\n---------------------------------------";
    
    void displayMenu() {
        char option = ' ';
        do {
            System.out.println(MENU);           //display the main menu
            
            String input = user_input.next();     //String input = this.getInput();  get the user's selection
            option = input.charAt(0);
            
            this.doAction(option);           //do action based on selection
            
        } while (option != '6');             //the selection is not "exit"
    }


    private void doAction(char option) {
        
        switch(option) {
            
            case '1': //create and start a new game
                
                option = 1;
                startNewGame();
                break;
                
            case '2': //load an existing game
                
                option = 2;
                startExistingGame();
                break;
                
            case '3': //display the options menu
                
                option = 3;
                displayOptionsMenu();
                break;
                
            case '4': //display the help menu
                
                option = 4;
                displayHelpMenu();
                break;
                
            case '5': //display the credits
                
                option = 5;
                displayCreditsMenu();
                break;
            
            case '0': //TEST: The General Store
                
                option = 0;
                GeneralStore();
                break;
                
            case '6': //exit the game
                
                option = 6;
                exitGame();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }

    private void startNewGame() {

        LoadNewGame newGame = new LoadNewGame();
        newGame.displayMenu();
        
    }

    private void startExistingGame() {

        LoadExistingGame loadGame = new LoadExistingGame();
        loadGame.displayMenu();
        
    }

    private void displayOptionsMenu() {

        OptionsMenuView optionsMenu = new OptionsMenuView();
        optionsMenu.displayMenu();
        
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();

    }

    private void displayCreditsMenu() {

        CreditsMenuView creditsMenu = new CreditsMenuView();
        creditsMenu.displayMenu();
        
    }
    
    private void exitGame() {
        System.out.println("Thanks for playing!");
        System.exit(0);
    }

    private String getInput() {
        System.out.println("*** getInput working ***");    
        return null;
    }

    private void GeneralStore() {
        
        GeneralStore genStore = new GeneralStore();
        genStore.displayMenu();
        
    }

    /*private void CastleClass() {
        CastleClass castle = new CastleClass();
        castle.displayMenu();
    }*/

    
    
}
