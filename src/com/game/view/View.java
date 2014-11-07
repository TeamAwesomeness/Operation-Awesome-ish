package com.game.view;

import java.util.Scanner;

public abstract class View implements ViewInterface {
    
    String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;
        
        do {
            
            System.out.println(this.promptMessage); //Display the Prompt
            value = this.getInput(); //get the user's selection
            this.doAction(value); //do action based on selection
            
        } while (!value.equals("Q"));
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            //prompt for the players name
            System.out.println("\t\nWhat is your name?");
            
            //get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid Selection *** Try again");
                continue;
                
            }
            
            break;
            
        }
        
        return selection; //return the name
    }
}


