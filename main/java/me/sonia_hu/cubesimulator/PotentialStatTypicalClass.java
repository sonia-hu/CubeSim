package me.sonia_hu.cubesimulator;

/**
 * Created by shu on 8/16/2016.
 */
public class PotentialStatTypicalClass extends PotentialStatClass {

    public PotentialStatTypicalClass(String potentialName) {
        name = potentialName;
        numberOfTiers = 4; /* where 4 is the typical number of tiers */
        uniqueStats = new int[numberOfTiers];
        legendaryStats = new int[numberOfTiers];
        equipmentLevels = new int[numberOfTiers];
        minimumLevel = 0;
        uniqueStats[0] = 3;
        uniqueStats[1] = 6;
        uniqueStats[2] = 9;
        uniqueStats[3] = 10;
        legendaryStats[0] = 6;
        legendaryStats[1] = 9;
        legendaryStats[2] = 12;
        legendaryStats[3] = 13;
        equipmentLevels[0] = 30;
        equipmentLevels[1] = 70;
        equipmentLevels[2] = 150;
        equipmentLevels[3] = 250;
    }

}
