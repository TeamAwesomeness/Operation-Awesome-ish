package com.game;

import com.game.CombatControlView;

class DungeonView1 {
    // Icy Caves
    void display() {
        System.out.println("\n\t=========================================");
        System.out.println("\n\t=               Icy Caves               =");
        CombatControlView startCombat = new CombatControlView();
        startCombat.startCombat();
    }
    
}
