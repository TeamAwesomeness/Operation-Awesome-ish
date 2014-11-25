package com.game.view;

import com.game.main.CuriousWorkmanship;
import com.game.view.Game;
import com.game.view.Map;
import exceptions.MapControlException;
import java.awt.Point;

class MapControl {

    static void moveActorsToStartingLocation(Map map) {
        System.out.println(" ");    
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
    
    public static void moveActorToLocation(Actor actor, Point coordinates) throws MapControlException {
        Map map = (Map) CuriousWorkmanship.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can Not Move Actor To Location "
                                        + coordinates.x + ", " + coordinates.y
                                        + " because that location is outside "
                                        + " the bounds of the map.");
            }
        }
    
    public void getCurrentGame() {}
    
    
    public void getMap() {}
    
    
    static Map createMap() {
        Map map  = new Map (2,3);
        
        Scene[] scenes = createScenes();
        
        //GameControl.assignScenesToLocations(map, scenes);
        
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
