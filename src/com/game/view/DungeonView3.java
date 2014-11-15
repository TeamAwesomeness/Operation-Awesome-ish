package com.game.view;

class DungeonView3 {
    // Spooky Hollow
    void display() {
        System.out.println("\n\t=========================================");
        System.out.println("\n\t=            Spooky Hollow              =");
        CombatControlView startCombat = new CombatControlView();
        startCombat.startCombat();
    }
    
}
