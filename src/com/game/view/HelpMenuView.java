package com.game.view;

import java.util.Scanner;

public class HelpMenuView {

    Scanner user_input = new Scanner(System.in);

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|            Help Menu                |"
            + "\n---------------------------------------"
            + "\n1 - Moving in The Kingdom             |"
            + "\n2 - The Numbers                       |"
            + "\n3 - The Syntax                        |"
            + "\n4 - The General Store                 |"
            + "\n5 - Fighting                          |"
            + "\n6 - Health                            |"
            + "\n7 - Food                              |"
            + "\n8 - Exit to Main Menu                 |"
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
         
            case '1': //MENU OPTION [1]:: Moving in The Kingdom
                
                option = 1;
                System.out.println("\n\n");
                System.out.println("To move in the kingdom, you select which"
                               + "\nplace you want to move to. For example, "
                               + "\non your map, there will be the choice to"
                               + "\ngo to the Castle, the General Store, the"
                               + "\nHoly Citadel, and a dungeon. You type"
                               + "\nthe number on the map that you want to go"
                               + "\nto and it moves you there.");
                return;
                
            case '2': //MENU OPTION [2]:: The Numbers
                
                option = 2;
                System.out.println("\n\n");
                System.out.println("There are numbers on the screen. These"
                               + "\nare very special, as they are your"
                               + "\noptions. Select the option by choosing"
                               + "\nthe number associated with it and press"
                               + "\nenter."
                );
                return;
                
            case '3': //MENU OPTION [3]:: The Syntax
                
                option = 3;
                System.out.println("\n\n");
                System.out.println("Currently, there are no special numbers"
                               + "\nor characters in the game, so you don't"
                               + "\nneed to worry about this."
                );
                return;
                
            case '4': //MENU OPTION [4]:: The General Store
                
                option = 4;
                System.out.println("\n\n");
                System.out.println("The General Store is your life line."
                               + "\nThe store contains food, potions and"
                               + "\nlives for you to purchase. Without"
                               + "\nthese options to purchase food, your"
                               + "\ncharacter will otherwise die and lose"
                               + "\nprogress. Don't die! Buy today!"
                               + "\n"
                               + "\nExperience, won by fighting, is the"
                               + "\ncurrency of the game. The General Store"
                               + "\nalso saves your game upon entering it."
                );
                return;
                
            case '5': //MENU OPTION [5]:: Fighting
                
                option = 5;
                System.out.println("\n\n");
                System.out.println("When you get into a dungeon, your battle"
                               + "\nbegins. One of these mobs contains the"
                               + "\nmagic sphere that you are collecting."
                               + "\nThere are three dungeons, with three very"
                               + "\nvery different magical spheres."
                               + "\n"
                               + "\nWhen you begin a fight, it will show your"
                               + "\nhealth, your enemies health, and your"
                               + "\nenemies name. Each fight has randomized"
                               + "\na monster, a monsters health, a monsters"
                               + "\ndrop table and experience."
                );
                return;
                
            case '6': //MENU OPTION [6]:: Health
                
                option = 6;
                System.out.println("\n\n");
                System.out.println("Run out of health in The Kingdom, and it's"
                               + "\nall over for your hero. If you do happen to"
                               + "\ndie, you will lose all of your hard earned"
                               + "\nexperience. Remember, experience is the"
                               + "\ncurrency of the game and is very valuable."
                               + "\n"
                               + "\nAfter you die, you will have the opportunity"
                               + "\nto return to life via a save point. Save"
                               + "\npoints only happen when you enter a General"
                               + "\nStore, so be sure to save there often!"
                );
                return;
                
            case '7': //MENU OPTION [7]:: Food
                
                option = 7;
                System.out.println("\n\n");
                System.out.println("There are three types of foods in the game."
                               + "\nMoldy Bread, Slimy Chicken and Potions of "
                               + "\nHealth are available at the General Store."
                               + "\n"
                               + "\nThe Moldy Bread heals you for a maximum of"
                               + "\n3 health points (or HP) but your inventory"
                               + "\ncan carry up to five of them."
                               + "\n"
                               + "\nThe Slimy Chicken heals you for a maximum"
                               + "\nof 15 health points (or HP) but your"
                               + "\ninventory can carry up to two of them."
                               + "\n"
                               + "\nThe Potions of Health heals you for a"
                               + "\nmaximum of 30 health points (or HP). Be"
                               + "\ncareful though, you can only carry one!"
                               + "\n"
                               + "\nThe last item sold at the General Store is"
                               + "\nthe Extra Life. These will save you from "
                               + "\ndeath when you are faced with it. There is"
                               + "\nno maximum of how many you can carry, but"
                               + "\nthey are very expensive. That might deter"
                               + "\nfrom stockpiling this precious item."
                );
                return;
                
            case '8': //MENU OPTION [8]:: GO BACK TO MAIN MENU
                
                option = 8;
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.display();//was displayMenu()
                return;
                
            default:
                
                System.out.println("\n Invalid selection!");
                break;
                
        }
    }

    
    
}