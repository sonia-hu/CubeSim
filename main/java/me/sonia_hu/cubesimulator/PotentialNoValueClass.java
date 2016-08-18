package me.sonia_hu.cubesimulator;

/**
 * Created by shu on 8/17/2016.
 */
public class PotentialNoValueClass extends PotentialClass{
    private int minimumLevel;

    public PotentialNoValueClass(String potentialName) {
        name = potentialName;
    }

    public PotentialNoValueClass(String potentialName, int minLvl) {
        name = potentialName;
        minimumLevel = minLvl;
    }

}
