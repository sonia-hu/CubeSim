package me.sonia_hu.cubesimulator;

/**
 * Created by shu on 8/16/2016.
 */
public class PotentialStatClass extends PotentialClass {
    protected int numberOfTiers;
    protected int uniqueStats[];
    protected int legendaryStats[];
    protected int equipmentLevels[];
    static String valueTypeIdentifier = "%";
    protected int minimumLevel;

    public int getNumberOfTiers(){
        return numberOfTiers;
    }

    public int getMinimumLevel() {
        return minimumLevel;
    }

    protected int getEquipTier (int equipLevel) {
        int tier = numberOfTiers;
        while(true) {
            tier -= 1;
            if ((tier < 0) || (equipLevel > equipmentLevels[tier])) {
                break;
            }
        }
        return tier+1;
    }

    public int getUniqueValue(int equipLevel) {
        if (equipLevel < minimumLevel) {
            return 0;
        }
        return uniqueStats[getEquipTier(equipLevel)];
    }

    public int getLegendaryValue(int equipLevel) {
        if (equipLevel < minimumLevel) {
            return 0;
        }
        return legendaryStats[getEquipTier(equipLevel)];
    }

    public String getValueTypeIdentifier() {
        return valueTypeIdentifier;
    }

}
