package com.game.view;

import com.game.main.CuriousWorkmanship;
import com.game.view.Game;
import com.game.view.Map;

class MapControl {

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum SceneType{
        start,
        kingdom,
        generalstore,
        dungeon1,
        dungeon2,
        dungeon3,
        holycitadel,
        king,
        finish
    }

    static Map createMap() {
        Map map  = new Map (2,3);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    private static Scene[] createScenes() {
        //BufferedImage image = null
        Game game = com.game.main.CuriousWorkmanship.getCurrentGame();
        Scene[] scenes = new Scene[SceneType.values().length];
        
        // Phase 1
        Scene startingScene = new Scene();
        startingScene.setDescription(
        "Beginning Phase 1");
        startingScene.setMapSymbol(" K ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(5);        
        
        
        scenes[SceneType.start.ordinal()] = startingScene;
       
        
        // Phase 2
        Scene finishScene = new Scene();
        finishScene.setDescription(
        "King Jeffrey: Pff Pff! This thing on? Oh, yes, hello hero!"
                + "You've done a spot on job, you've finished my quest and saved"
                + "the world! Thank you, you have our eternal gratitude."
                + "Now why don't you go out and build a nice home in our world!");
        
        finishScene.setMapSymbol(" HC ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);        
        
        scenes [SceneType.finish.ordinal()] = finishScene;

        return scenes;
        
    } //end create scenes
    
} //End
