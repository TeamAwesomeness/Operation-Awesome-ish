package com.game.view;

class Scene {

    public Scene() {
    }

    void setDescription(String string) {
        System.out.println("set description");
    }

    void setMapSymbol(String st) {
        System.out.println("set map symbol");    
    }

    void setBlocked(boolean b) {
        System.out.println("set blocked");
    }

    void setTravelTime(int i) {
        System.out.println("set travel time int");
    }

    void setTravelTime(double POSITIVE_INFINITY) {
        System.out.println("set travel time double");
    }
    
    
}