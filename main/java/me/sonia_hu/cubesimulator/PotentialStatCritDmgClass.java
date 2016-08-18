package me.sonia_hu.cubesimulator;

/**
 * Created by shu on 8/16/2016.
 */
public class PotentialStatCritDmgClass extends PotentialStatClass {

    public PotentialStatCritDmgClass (String potentialName) {
        name = potentialName;
        minimumLevel = 50;
        numberOfTiers = 3;
        uniqueStats[0] = 0;
        uniqueStats[1] = 0;
        uniqueStats[2] = 0;
        legendaryStats[0] = 9;
        legendaryStats[1] = 12;
        legendaryStats[2] = 15;
        equipmentLevels[0] = 60;
        equipmentLevels[1] = 80;
        equipmentLevels[2] = 250;
    }

}
