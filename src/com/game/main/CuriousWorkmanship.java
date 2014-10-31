package com.game.main;

import com.game.model.Player;
import com.game.view.StartProgramView;

public class CuriousWorkmanship {

    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        CuriousWorkmanship.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CuriousWorkmanship.player = player;
    }
    
    
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        
        
        //create startprogramview and strt the prog
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        /*
        //Initiate King with kingNPC
        King kingNPC = new King();
        //Initiating kingNPC
        kingNPC.setNpcID(2);
        kingNPC.setName("King Pompington");
        //==================================================
        String kingInfo = kingNPC.toString();
        System.out.println("\n\nProject Awesomness provides a king for the hero to get quest. The king in this project has two variables.\n It looks like this: " + kingInfo); 
        //==================================================
         //Initiate Soldier with soldierNPC
        Soldier soldierNPC = new Soldier();
        //Initiating soldierNPC
        soldierNPC.setNpcID(3);
        soldierNPC.setName("Lord Knight");
        //==================================================
        String soldierInfo = soldierNPC.toString();
        System.out.println("\n\nProject Awesomness provides a soldier to get quest from king. The hero in this project has two variables.\n It looks like this: " + soldierInfo); 
        //==================================================
         //Initiate KingdomCastle with castle
        KingdomCastle castle = new KingdomCastle();
        //Initiating castle
        castle.setNpcID(2);
        castle.setLocationID(1);
        castle.setName("Castle Gray Skull");
        //==================================================
        String castleInfo = castle.toString();
        System.out.println("\n\nProject Awesomness provides a castle for the king and hero to have discourse. The castle in this project has three variables.\n It looks like this: " + castleInfo); 
        //==================================================
         //Initiate KingdomValley with valley
        KingdomValley valley = new KingdomValley();
        //Initiating valley
        valley.setLocationID(0);
        valley.setName("Valley Forge");
        //==================================================
        String valleyInfo = valley.toString();
        System.out.println("\n\nProject Awesomness provides a map for the hero. The valley in this project has two variables.\n It looks like this: " + valleyInfo); 
        //==================================================
         //Initiate HolyCitadel with citadel
        HolyCitadel citadel = new HolyCitadel();
        //Initiating citadel
        citadel.setNpcID(0);
        citadel.setName("Holy Citadel");
        citadel.setLocationID(0);
        citadel.setEnemyID(9); //enemyID
        //==================================================
        String citadelInfo = citadel.toString();
        System.out.println("\n\nProject Awesomness provides a citadel for the hero to place orbs and fight dragon. The citadel in this project has four variables.\n It looks like this: " + citadelInfo); 
        //==================================================
         //Initiate EndBossDragon with endboss
        EndBossDragon endboss = new EndBossDragon();
        //Initiating endboss
        endboss.setNpcID(4);
        endboss.setName("Trogdor");
        //==================================================
        String endbossInfo = endboss.toString();
        System.out.println("\n\nProject Awesomness provides a dragon to fight the hero. The dragon in this project has two variables.\n It looks like this: " + endbossInfo); 
        //==================================================
         //Initiate Chickens with chickensFood
        Chickens chickensFood = new Chickens();
        //Initiating chickensFood
        chickensFood.setItemID(3);
        chickensFood.setHealingAmt(15);
        chickensFood.setName("Cooked Chicken");
        chickensFood.setMin(0);
        chickensFood.setMax(2);
        //==================================================
        String chickensInfo = chickensFood.toString();
        System.out.println("\n\nProject Awesomness provides chickens for hero to regenerate health. The chickens in this project has five variables.\n It looks like this: " + chickensInfo); 
        //==================================================
        //Initiate Potions with potionsFood
        Potions potionsFood = new Potions();
        //Initiating potionsFood
        potionsFood.setItemID(0);
        potionsFood.setName("Potion Vial");
        potionsFood.setHealingAmt(30);
        potionsFood.setMin(0);
        potionsFood.setMax(2);
        //==================================================
        String potionsInfo = potionsFood.toString();
        System.out.println("\n\nProject Awesomness provides potions for hero to regenerate health. The potions in this project has five variables.\n It looks like this: " + potionsInfo); 
        //==================================================
        //Initiate Bread with breadFood
        Bread breadFood = new Bread();
        //Initiating breadFood
        breadFood.setItemID(2);
        breadFood.setName("Bread");
        breadFood.setMin(0);
        breadFood.setMax(5);
        breadFood.setHealingAmt(3);
        //==================================================
        String breadInfo = breadFood.toString();
        System.out.println("\n\nProject Awesomness provides bread for the Hero to eat. Bread in this project has five variables.\n It looks like this: " + breadInfo); 
        //==================================================
        //Initiate Dungeon1 with dungeonOne
        Dungeon1 dungeonOne = new Dungeon1();
        //Initiating dungeonOne
        dungeonOne.setName("Ice Caverns");
        dungeonOne.setLocationID(4);
        dungeonOne.setEnemyID(1);
        //==================================================
        String dungeon1Info = dungeonOne.toString();
        System.out.println("\n\nWelcome to the Ice Caverns. In this project, this dungeon has three variables.\n It looks like this: " + dungeon1Info); 
        //==================================================
        //Initiate Dungeon2 with dungeonTwo
        Dungeon2 dungeonTwo = new Dungeon2();
        //Initiating dungeonTwo
        dungeonTwo.setName("Fire Mountain");
        dungeonTwo.setLocationID(5);
        dungeonTwo.setEnemyID(2);
        //==================================================
        String dungeon2Info = dungeonTwo.toString();
        System.out.println("\n\nWelcome to Fire Mountain. In this project, this dungeon has three variables.\n It looks like this: " + dungeon2Info); 
        //==================================================
        //Initiate Dungeon3 with dungeonThree
        Dungeon3 dungeonThree = new Dungeon3();
        //Initiating dungeonThree
        dungeonThree.setName("Creepy Hollow");
        dungeonThree.setLocationID(6);
        dungeonThree.setEnemyID(3);
        //==================================================
        String dungeon3Info = dungeonThree.toString();
        System.out.println("\n\nWelcome to Creepy Hollow. In this project, this dungeon has three variables.\n It looks like this: " + dungeon3Info); 
        //==================================================
        //Initiate Enemy with enemy
        Enemy enemy = new Enemy();
        //Initiating enemy
        enemy.setName("Zombie, Assassin, Warrior, Skeleton");
        enemy.setNpcID(1);
        //==================================================
        String enemyInfo = enemy.toString();
        System.out.println("\n\nProject Awesomness provides enemies for the hero to attack. The enemies in this project have two variables.\n It looks like this: " + enemyInfo); 
        //==================================================
        //Initiate GeneralStore with merchantOne
        GeneralStore merchantOne = new GeneralStore();
        //Initiating merchantOne
        merchantOne.setName("General Store");
        merchantOne.setLocationID(6);
        merchantOne.setItemID(0);
        merchantOne.setItemAmt(4);
        //==================================================
        String merchantInfo = merchantOne.toString();
        System.out.println("\n\nProject Awesomness provides a General Store for the heo. The General Store in this project has four variables.\n It looks like this: " + merchantInfo); 
        //==================================================
        //Initiate Lives with lives
        Lives lives = new Lives();
        //Initiating lives
        lives.setName("Lives");
        lives.setItemID(1);
        lives.setMin(0);
        lives.setMax(3);        
        //==================================================
        String livesInfo = lives.toString();
        System.out.println("\n\nProject Awesomness provides lives, so that our hero won't unnecessarily die. Lives in this project has four variables.\n It looks like this: " + livesInfo); 
        //==================================================
        */
        
        
        //String breadInfo = breadFood.toString();
        //System.out.println(breadInfo); 
        
        
        
        
    }

    private static class Game {

        public Game() {
        }
    }
    
    

}
        
