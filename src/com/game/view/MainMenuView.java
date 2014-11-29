package com.game.view;

import java.util.Scanner;
import static com.game.view.LoadNewGame.waitTime;

public class MainMenuView {
    
    Scanner user_input = new Scanner(System.in);
    private final String MENU = "\n"
            + "\n\t---------------------------------------"
            + "\n\t  Welcome to the Menu "
            + "\n\t---------------------------------------"
            + "\n\t1 - New Game                          |"
            + "\n\t2 - Load Game                         |"
            + "\n\t3 - Options                           |"
            + "\n\t4 - Help                              |"
            + "\n\t5 - Credits                           |"
            + "\n\t                                      |"
            + "\n\tq - Exit to Desktop                   |"
            + "\n\t---------------------------------------";

    /*public MainMenuView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n  Welcome to the Menu "
            + "\n---------------------------------------"
            + "\n1 - New Game                          |"
            + "\n2 - Load Game                         |"
            + "\n3 - Options                           |"
            + "\n4 - Help                              |"
            + "\n5 - Credits                           |"
            + "\nq - Exit to Desktop                   |"
            + "\n---------------------------------------");
    }*/
    private boolean promptMessage;
    
    
    void display() {
        char option = ' ';
        do {
            System.out.println(MENU);  //display the main menu
            
            String input = user_input.next();     //String input = this.getInput(); <= Jacksons =>Mine: String input = user_input.next(); get the user's selection
            option = input.charAt(0);
            
            this.doAction(option);           //do action based on selection
            
        } while (option != 'q');             //the selection is not "exit"
    }


    private void doAction(char option) {
        
        switch(option) {
            
            case '1': //create and start a new game
                
                startNewGame();
                break;
                
            case '2': //load an existing game
                
                startExistingGame();
                break;
                
            case '3': //display the options menu
                
                displayOptionsMenu();
                break;
                
            case '4': //display the help menu
                
                displayHelpMenu();
                break;
                
            case '5': //display the credits
                
                displayCreditsMenu();
                break;
                
            case 'q': //exit the game
                
                System.out.println("Thanks for playing!");
                waitTime(25000);
                exitGame();
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }
    
    private void startNewGame() {

        LoadNewGame newGame = new LoadNewGame();
        newGame.display();
        
    }

    private void startExistingGame() {

        LoadExistingGame loadGame = new LoadExistingGame();
        loadGame.display();
        
    }

    private void displayOptionsMenu() {

        OptionsMenuView optionsMenu = new OptionsMenuView();
        optionsMenu.display();
        
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();

    }

    private void displayCreditsMenu() {

        CreditsMenuView creditsMenu = new CreditsMenuView();
        creditsMenu.display();
        
    }
    
    private void exitGame() {
        System.exit(0);
    }

    
}