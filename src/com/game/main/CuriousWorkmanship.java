package com.game.main;

import com.game.view.Game;
import com.game.view.Player;
import com.game.view.StartProgramView;
import java.io.Serializable;

public class CuriousWorkmanship implements Serializable {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {

        //create startprogramview and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        com.game.main.CuriousWorkmanship.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        com.game.main.CuriousWorkmanship.player = player;
    }

    public static class Scene {

        public Scene() {
        }
    }

} //End