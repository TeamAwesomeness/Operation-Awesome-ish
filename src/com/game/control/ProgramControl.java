package com.game.control;

import com.game.main.CuriousWorkmanship;
import com.game.model.Player;



public class ProgramControl {

    public static Player createPlayer(String name) {
        
        Player player = new Player();
        player.setName(name);
        
        CuriousWorkmanship.setPlayer(player);
        
        return player;
    }
    
}
