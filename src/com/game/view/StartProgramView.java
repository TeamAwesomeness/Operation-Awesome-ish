package com.game.view;

import com.game.Player;
import com.game.ProgramControl;
import static com.game.view.LoadNewGame.waitTime;
import java.util.Scanner;

public class StartProgramView {
    public static StartProgramView startProgramView;

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
        mainMenu.display(); //was displayMenu();
    }

    private void displayBanner() {
                
        System.out.println("The Kingdom");   
        /*
        waitTime(50000);
        System.out.print("\n\nAccording to our oldest and most ancient scrolls"
                         + "\nthe mythical dragons descended from a distant nebula"
                         + "\nto the world and created order and life.");
        waitTime(130000);
        System.out.print("\n\nThe dragon of power tore the great mountain red with"
                         + "\nfire and created land.");    
        waitTime(120000);        
        System.out.print("\n\nThe dragon of wisdom brought wizardry and science and"
                         + "\nbrought order to nature.");  
        waitTime(120000);        
        System.out.print("\n\nAnd the dragon of courage, through justice and vigor,"
                         + "\ncreated life - the animals that crawl the land and"
                         + "\nthe birds that soar the blue skies.");
        waitTime(140000);
        System.out.print("\n\nAfter the dragons had finished their work, they left"
                         + "\nthe world, but not without leaving behind three magical"
                         + "\nspheres of power, one for each aspect.");
        waitTime(150000);
        System.out.print("\n\nThe Sphere of Power, the Sphere of Wisdom and the"
                         + "\nSphere of Courage. A small but powerful portion of"
                         + "\nthe essence of the dragons was held in these mighty"
                         + "\nartifiacts.");
        waitTime(165000);
        System.out.print("\n\nIn The Kingdom, there are many kingdom buildings which"
                         + "\nare mentioned repeatedly in the legends. These buildings"
                         + "\nwhich now lie in ruin, pale shadows of their former"
                         + "\nsplendor, are closely tied to the magical spheres.");
        waitTime(175000);
        System.out.print("\n\nAmong these ruins lies one which has stood the test of time"
                         + "\nand it is here that the lost hero must bring the magical"
                         + "\nspheres to, and restore peace and prosperity to this land.");
        waitTime(180000);
        
        System.out.print("\n\nLoading");
        waitTime(45000);
        System.out.print("...");
        waitTime(65000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(55000);
        System.out.print("...");
        waitTime(65000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(45000);
        System.out.print("...");
        waitTime(55000);
        System.out.print("Loaded!");
        waitTime(55000);
        */
        System.out.println("\n\n\n\n");
        
        System.out.println("*<<<<<<<<<<<<<<<<<|>>>>>>>>>>>>>>>>>*");
        System.out.println("@            The Kingdom            @");
        System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*");
        System.out.println("@  The hero has been called to save @");
        System.out.println("@  the kingdom. Go now and collect  @");
        System.out.println("@  the magical orbs and defeat the  @");
        System.out.println("@            evil dragon.           @");
        System.out.println("*<<<<<<<<<<<<<<<<<|>>>>>>>>>>>>>>>>>*");

     }

    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            System.out.println("Hero! What is your name to be?");
            System.out.println("#>: ");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 1) {
                System.out.println("Invalid name - the name must not be blank");
                continue;
                
            } else if (playersName.length() >= 12) {
                System.out.println("Invalid name - the name must be less"
                        + "\nthan or equal to 12 characters");
                continue;
                
            } else if ("lol".equals(playersName)) {
                System.out.println("Invalid name - name must be semi-realistic");
                continue;
                
            } else if ("asdf".equals(playersName)) {
                System.out.println("Invalid name - name must be semi-realistic");
                continue;
                
            } else if ("asd".equals(playersName)) {
                System.out.println("Invalid name - name must be semi-realistic");
                continue;
                
            } else if ("dick".equals(playersName)) {
                System.out.println("Invalid name - really? REALLY? ... now I'm"
                               + "\ngonna have you put in a timeout!\n");
                waitTime(100000);
                System.out.println("5...");
                waitTime(45000);
                System.out.println("4...");
                waitTime(45000);
                System.out.println("3...");
                waitTime(45000);
                System.out.println("2...");
                waitTime(45000);
                System.out.println("1...");
                waitTime(45000);
                System.out.println("0...");
                waitTime(45000);
                System.out.println("Now be nice, and pick a nice name!\n");
                continue;
                
            } else if ("moses".equals(playersName)) {
                waitTime(50000);
                System.out.println("\n"
                        + "\nCongratulations! This is an administrative name!"
                        + "\nYour hero will automatically heal in all dungeons!"
                        + "\nYour hero will never die!"
                        + "\nYour hero will earn 100 times more Experience!"
                        + "\nYour hero will go down in history as the best ever!"
                        + "\nYou've been put on the top list!"
                        + "\nYou are AWESOME!!");
                waitTime(45000);
                System.out.println("WWWWWWWWWWWWWWWWWWW\n" +
                                   "WW  WWWW  WWWW   WW\n" +
                                   "W    WW    WW     W\n" +
                                   "W    WW  W  W  W  W\n" +
                                   "WWW  W  WW  W  W  W\n" +
                                   "WWW  W   W  W  W  W\n" +
                                   "W     W     W     W\n" +
                                   "W     WW   WWW   WW\n" +
                                   "WWWWWWWWWWWWWWWWWWW\n");
                waitTime(85000);
                break;
                
            } else if ("Moses".equals(playersName)) {
                waitTime(50000);
                System.out.println("\n"
                        + "\nCongratulations! This is an administrative name!"
                        + "\nYour hero will automatically heal in all dungeons!"
                        + "\nYour hero will never die!"
                        + "\nYour hero will earn 100 times more Experience!"
                        + "\nYour hero will go down in history as the best ever!"
                        + "\nYou've been put on the top list!"
                        + "\nYou are AWESOME!!");
                waitTime(45000);
                System.out.println("WWWWWWWWWWWWWWWWWWW\n" +
                                   "WW  WWWW  WWWW   WW\n" +
                                   "W    WW    WW     W\n" +
                                   "W    WW  W  W  W  W\n" +
                                   "WWW  W  WW  W  W  W\n" +
                                   "WWW  W   W  W  W  W\n" +
                                   "W     W     W     W\n" +
                                   "W     WW   WWW   WW\n" +
                                   "WWWWWWWWWWWWWWWWWWW\n");
                waitTime(85000);
                break;
                
            } else if ("Apocolyptus".equals(playersName)) {
                System.out.println("\nEnter password::");
                System.out.println("#>: ");
                waitTime(95000);
                System.out.println("Correct!");
                waitTime(55000);
                System.out.println("Now loading...");
                waitTime(55000);
                System.out.println("Now loading... Oceans     ...");
                waitTime(95000);
                System.out.println("Now loading... Villages   ...");
                waitTime(95000);
                System.out.println("Now loading... Castles    ...");
                waitTime(95000);
                System.out.println("Now loading... Government ...");
                waitTime(95000);
                System.out.println("Now loading... Corrupted People ...");
                waitTime(95000);
                System.out.println("Now loading... Apocolyptus ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Gear ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Poisons ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Black Metal ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Cutthroat Plots ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Slimy Git Behavior ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Strange Behavior ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Undead Self ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Captain Rank ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Captain Rank ... The White Queen ...");
                waitTime(45000);
                System.out.println("Now loading... Apocolyptus ... Story Loaded. Hero: ...");
                waitTime(95000);
                System.out.println("Welcome Lord Admiral Apocolyptus. Mi'lord, I have been "
                                 + "\nwaiting for your arrival");
                waitTime(45000);
                break;
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
