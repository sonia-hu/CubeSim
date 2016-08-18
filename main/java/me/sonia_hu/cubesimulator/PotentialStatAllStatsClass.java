package me.sonia_hu.cubesimulator;

/**
 * Created by shu on 8/16/2016.
 */
public class PotentialStatAllStatsClass extends PotentialStatClass {

    public PotentialStatAllStatsClass(String potentialName) {
        name = potentialName;
        minimumLevel = 0;
        numberOfTiers = 4;
        uniqueStats = new int[numberOfTiers];
        legendaryStats = new int[numberOfTiers];
        equipmentLevels = new int[numberOfTiers];
        uniqueStats[0] = 2;
        uniqueStats[1] = 4;
        uniqueStats[2] = 6;
        uniqueStats[3] = 7;
        legendaryStats[0] = 3;
        legendaryStats[1] = 6;
        legendaryStats[2] = 9;
        legendaryStats[3] = 10;
        equipmentLevels[0] = 30;
        equipmentLevels[1] = 70;
        equipmentLevels[2] = 150;
        equipmentLevels[3] = 250;
    }
}
