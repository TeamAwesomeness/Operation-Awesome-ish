package com.game;

import com.game.view.GameMapView;
import java.util.Random;
import java.util.Scanner;
import static com.game.view.LoadNewGame.waitTime;

public class CombatControl {
    public void startCombat() {
        //System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        // Game variables - Dungeon type game, randomly gen combat
        String[] enemies = { "Skeleton", "Zombie", "Warrior", "Assassin" }; //Enemy Names
        int maxEnemyHealth = 75; //Max Enemy Health
        int enemyAttackDamage = 25; //Max Enemy Attack Damage
        int magicalSpheres = 1; //Max Magical Spheres to drop from an enemy
        
        // Player Variables
        int health = 100;       //Health of Hero
        int attackDamage = 50;  //Attack damage of Hero
        int numHealthPots = 3;  //Number of Healthpots our Hero starts out with
        int healthPotionHealAmount = 30; //Health Potion Max Heal Amount
        int healthPotionDropChance = 50; //Percentage! Health Potion Drop Chance from Enemy
        
        boolean running = true; //condition for a while loop
        
        
        GAME: //labeled this while loop
        while(running) {
            // Display Game Graphics
            System.out.println("\n\t=========================================");
            
            int enemyHealth = rand.nextInt(maxEnemyHealth); //Enemy Health Start, random between zero and 75
            String enemy = enemies[rand.nextInt(enemies.length)]; //Chooses Enemy Name
            System.out.println("\t# " + enemy + " appeared! #\n"); // \t character for tab, \n line break      # Skeleton has appeared! #
            
            while(enemyHealth > 0) {
                System.out.println("\n\tYour HP: " + health
                                 + "\n\t" + enemy + "'s HP: " + enemyHealth
                                 + "\n\n\tWhat would you like to do?"
                                 + "\n\t1 - Attack"
                                 + "\n\t2 - Drink Potion of Health"
                                 + "\n\t3 - Run!");
                
                String input = in.nextLine();
                if(input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);    //Hero Damage Dealt, between 0 and 50
                    int damageTaken = rand.nextInt(enemyAttackDamage);    //Hero Damage Taken, between 0 and the max
                    
                    enemyHealth -= damageDealt;
                    health -= damageTaken;
                    
                    System.out.println("\n\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\n\t> You receive " + damageTaken + " in retaliation!");
                    
                    if(health < 1) {
                        System.out.println("\n\t> You fail. You've died!");
                        break;
                        
                    }
                    
                }
                else if (input.equals("2")) {
                    if(numHealthPots > 0) {
                        health += healthPotionHealAmount;
                        numHealthPots--;
                        System.out.println("\n\t> You drink the magical potion healing yourself for " + healthPotionHealAmount + ". "
                                         + "\n\t> You now have " + health + " HP."
                                         + "\n\t> You have " + numHealthPots + " health potions left.\n");
                        if(health > 100) {
                            health = 100;
                        }
                        
                        else {
                            health = health;
                        }
                    }
                    else {
                        System.out.println("\n\t> You have no magical potions of healing left! Defeat enemeies for a chance to get one.");
                    }
                }
                else if(input.equals("3")) {
                    System.out.println("\n\tYou run away from the " + enemy + ", and exit the dungeon!");
                    //continue GAME;
                    //Display the Game Map
                    GameMapView mapView = new GameMapView();
                    mapView.display();
                }
                else {
                    System.out.println("\n\tYou fail. Like death.");
                }
                
            } //Enemy Health loop
            
            // Is hero dead?
            if(health < 1) {
                System.out.println("\n\nYou limp out of the area, weak from battle.");
                break;
            }
            
            System.out.println("\n\t=======================================");
            System.out.println("\n\t# " + enemy + " was defeated! # ");
            System.out.println("\n\t# You have " + health + " HP left. #");
            //Install Random Drop Chance in percentage (health pot)
            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPots++;
                System.out.println("\n\t# The " + enemy + " dropped a health potion! # ");
                System.out.println("\n\t# You now have " + numHealthPots + " health potion(s). # ");
            }
            System.out.println("\n\t=======================================");
            System.out.println("\n\tWhat would you like to do now?");
            System.out.println("\n\t1 - Continue Fighting");
            System.out.println("\n\t2 - Go to Game Map");
            System.out.println("\n\t=======================================");
            
            String input = in.nextLine();
            
            while(!input.equals("1") && !input.equals("2")) {
                System.out.println("\n\tInvalid command!");
                input = in.nextLine();
            }
            
            if(input.equals("1")) {
                System.out.println("\n\tYou continue on your adventure!");
            }
            else {
                System.out.println("\n\tYou exit the dungeon!");
                //Display the Game Map
                GameMapView mapView = new GameMapView();
                mapView.display();
            }
            
        } //GAME while loop
        
        
        
    }

}