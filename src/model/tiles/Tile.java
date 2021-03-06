package model.tiles;

import model.features.Feature;
import model.resources.Resource;

abstract public class Tile {
    protected static int movingPrice;
    protected static int food;
    protected static int production;
    protected static int gold;
    protected static int changingPercentOfStrength;
    protected Feature feature;
    protected int[] resources;

    public static int getMovingPrice() {
        return movingPrice;
    }

    public static int getChangingPercentOfStrength() {
        return changingPercentOfStrength;
    }

    public static int getFood() {
        return food;
    }

    public static int getProduction() {
        return production;
    }

    public static int getGold() {
        return gold;
    }

    public Feature getFeature() {
        return feature;
    }

    public int[] getResources() {
        return resources;
    }


    public boolean setFeature(Feature feature){
        if(isFeatureValid(feature)){
            this.feature = feature;
            return true;
        }
        return false;
    }
    abstract boolean isFeatureValid(Feature feature);

    public boolean setResource(Resource resource){
        if(isResourceValid(resource)){
            return true;
        }
        return false;
    }
    abstract boolean isResourceValid(Resource resource);
}
