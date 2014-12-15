package com.game;

import com.game.view.GameMapView;
import java.util.Scanner;
import static com.game.view.LoadNewGame.waitTime;

public class Kingdom {

        Scanner user_input = new Scanner(System.in);
        
        int magicalSphere = 0;

        private final String MENU = "\n"
                + "\n---------------------------------------"
                + "\n    Welcome to the Kingdom            |"
                + "\n---------------------------------------"
                + "\n1 - Talk to the King                  |"
                + "\n2 - Inquire the Guards                |"
                + "\n3 - Nudge the King's throne           |"
                + "\n4 - Ask about upgrades                |"
                + "\n                                      |"
                + "\nq - Exit to the Map                   |"
                + "\n---------------------------------------";

        void display() {
            char option = ' ';
            do {
                System.out.println(MENU);

                String input = user_input.next();
                option = input.charAt(0);

                this.doAction(option);

            } while (option != 'q'); //THIS NUMBER MUST MATCH THE LAST NUMBER YOU CHOOSE
        }


        private void doAction(char option) {

            switch(option) {

                case '1': //Talk to the King 

                    System.out.println("\n\nGuard: Welcome Hero, to the Kingdom of Awesomeness!"
                                     + "\nGuard: This is our royal Kin-");
                    waitTime(45000);
                    System.out.println("\n\nKing Jeffrey: I can speak for myself, Sir Knight."
                                     + "\nKing Jeffrey: I am the King of this kingdom.");
                    waitTime(65000);
                    System.out.println("\n\nKing Jeffrey: I'm afraid we have a bit of a problem. You see, ever since"
                                     + "\nthe last hero that came to this land, we've witnessed some very scary events."
                                     + "\nCould you please accept our quest to fix the land? I fear it to be cursed.");
                    waitTime(65000);
                    System.out.println("\n\nKing Jeffrey: There are three magical spheres located nearby. I need you to"
                                     + "\ngo and get these spheres and return them to the Holy Citadel, to the"
                                     + "\nnorthwest of this kingdom.");
                    waitTime(65000);
                    System.out.println("\n\nKing Jeffrey: I fear that the last hero had stolen the magical spheres, the"
                                     + "\nsame that he was charged to go retrieve. Please, retrieve the spheres and"
                                     + "\nbring back peace to this land.");
                    waitTime(105000);
                    break;
                    
                    
                case '2': //Inquire the Guards

                    System.out.println("You inquire of the Guards, but they have nothing to say to you.");
                    waitTime(65000);
                    break;

                case '3': //Nudge the King's throne

                    if (magicalSphere == 3) {
                        System.out.println("You try to nudge the King's throne and it slides to reveal a secret hole!");
                        com.game.secretThroneRoom throneRoom = new com.game.secretThroneRoom();
                        throneRoom.display();
                        waitTime(35000);
                    } else {
                        System.out.println("You try to nudge the King's throne.");
                        System.out.println("King Jeffrey: What the-! What are you doing?");
                        waitTime(55000);
                    }
                    break;

                case '4': //Ask about upgrades

                    System.out.println("King Jeffrey: Upgrades haven't been enabled yet.");
                    waitTime(55000);
                    break;

                case 'q': //Exit to Map Menu
                    System.out.println("Exiting to Map...");
                    waitTime(15000);
                    GameMapView mapView = new GameMapView();
                    mapView.display();
                    return;

                default:

                    System.out.println("\n Invalid selection!");
                    break;

            }
        }

}
