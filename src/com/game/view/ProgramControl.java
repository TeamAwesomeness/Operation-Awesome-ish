package com.game.view;

import com.game.main.CuriousWorkmanship;



public class ProgramControl {

    public static Player createPlayer(String name) {
        
        Player player = new Player();
        player.setName(name);
        
        CuriousWorkmanship.setPlayer(player);
        
        return player;
    }
    
}
