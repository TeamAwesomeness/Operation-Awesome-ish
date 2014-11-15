package com.game.view;

class DungeonView2 {
    // Fiery Depths
    void display() {
        System.out.println("\n\t=========================================");
        System.out.println("\n\t=             Fiery Depths              =");
        CombatControlView startCombat = new CombatControlView();
        startCombat.startCombat();
    }
    
}
