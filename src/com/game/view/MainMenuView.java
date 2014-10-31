package com.game.view;

public class MainMenuView {

    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n|       WELCOME TO THE MAIN MENU      |"
            + "\n---------------------------------------"
            + "\nQ - New Game"
            + "\nW - Load Game"
            + "\nE - Options"
            + "\nR - Help"
            + "\nT - Credits"
            + "\nY - Exit to Desktop"
            + "\n---------------------------------------";
    
    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);           //display the main menu
            
            String input = this.getInput();     //get the user's selection
            selection = input.charAt(0);
            
            this.doAction(selection);           //do action based on selection
            
        } while (selection != 'Y');             //the selection is not "exit"
    }


    private void doAction(char selection) {
        
        switch (selection) {
            case 'Q': //create and start a new game
                //this.startNewGame();
                System.out.println("Starting new game...");
                break;
            case 'W': //load an existing game
                //this.startExistingGame();
                System.out.println("Loading existing game...");
                break;
            case 'E': //display the options menu
                //this.displayOptionsMenu();
                System.out.println("Displaying Options menu...");
                break;
            case 'R': //display the help menu
                //this.displayHelpMenu();
                System.out.println("Displaying Help menu...");
                break;
            case 'T': //display the credits
                //this.displayCreditsMenu();
                System.out.println("Displaying Credits menu...");
                break;
            case 'Y': //exit the game
                return;
            default:
                System.out.println("\n Invalid selection!");
                break;
        }
    }

    private void startNewGame() {
        //Create a New Game
        //GameControl.createNewGame(CuriousWorkmanship.getPlayer());
        
        //Display the Game Menu
        //GameMenuView gameMenu = new GameMenuView();
        //gameMenu.displayMenu();
        System.out.println("Starting new game...");
    }

    private void startExistingGame() {
        //Load Existing Game
        //GameControl.loadExistingGame(CuriousWorkmanship.getPlayer());
        
        //Display the Game Menu
        //GameMenuView gameMenu = new GameMenuView();
        //gameMenu.displayMenu();
        System.out.println("Loading existing game...");
    }

    private void displayOptionsMenu() {
        //Load Options Menu
        //GameControl.loadOptionsMenu(CuriousWorkmanship.getPlayer());
        
        //Display Options Menu
        //OptionsMenuView optionsMenu = new OptionsMenuView();
        //optionsMenu.displayMenu();
        System.out.println("Displaying Options menu...");
    }

    private void displayHelpMenu() {
        //Load Help Menu
        //GameControl.loadhelpMenu(CuriousWorkmanship.getPlayer());
        
        //Display Help Menu
        //HelpMenuView helpMenu = new HelpMenuView();
        //helpMenu.displayMenu();
        System.out.println("Displaying Help menu...");

    }

    private void displayCreditsMenu() {
        //Load Credits Menu
        //GameControl.loadcreditsMenu(CuriousWorkmanship.getPlayer());

        //Display Credits Menu
        //CreditsMenuView creditsMenu = new CreditsMenuView();
        //creditsMenu.displayMenu();
        System.out.println("Displaying Credits menu...");
    }

    private String getInput() {
        System.out.println("**working as intended**");    
        return null;
    }
    
}
