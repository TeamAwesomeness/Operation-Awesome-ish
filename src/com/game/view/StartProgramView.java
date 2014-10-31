package com.game.view;

import com.game.control.ProgramControl;
import com.game.model.Player;
import java.util.Scanner;

public class StartProgramView {

    public StartProgramView() {
        
    }
    
    public void startProgram() {
        
        //display the banner screen
        this.displayBanner();
        
        //prompt the player to enter their name && retrieve name
        String playersName = this.getPlayersName();
        
        //create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        //display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("*************************************");
        System.out.println("*  Welcome to Project Awesomeness   *");
        System.out.println("*************************************");
        System.out.println("*  The hero has been called to save *");
        System.out.println("*  the kingdom. Go now and collect  *");
        System.out.println("*  the magical orbs and defeat the  *");
        System.out.println("*            evil dragon.           *");
        System.out.println("*************************************");

     }

    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Hero! What is your name to be?");
            
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 1) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
            }
            break;
        }
        return playersName;
    }
    
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n==============================================");
        System.out.println("=#> Welcome to the game, " + player.getName() + "!");
        System.out.println("=#> The kingdom is in dire need of your help!");
        System.out.println("==============================================");
    }
    
}
