package me.sonia_hu.cubesimulator;

/**
 * Created by shu on 8/16/2016.
 */
public class PotentialFlatValueClass extends PotentialClass {
    protected static int uniqueValue;
    protected static int legendaryValue;
    static String valueTypeIdentifier;

    public int getUniqueValue(int equip) {
        return uniqueValue;
    }

    public int getLegendaryValue(int equip) {
        return legendaryValue;
    }

    public String getValueTypeIndentifier() {
        return valueTypeIdentifier;
    }

    public void setValueTypeIdentifier(String newType) {
        valueTypeIdentifier = newType;
    }
}
