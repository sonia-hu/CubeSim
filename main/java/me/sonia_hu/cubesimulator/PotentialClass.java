package me.sonia_hu.cubesimulator;

/**
 * Created by shu on 8/16/2016.
 */
public class PotentialClass {
    protected String name;
    private String equipNames[] = new String[]{"Hat","Top","Bottom","Gloves","Shoes",
            "Accessory","Emblem","Badge","Weapon","Secondary", "Cape"};
    protected boolean availOnEquip[] = new boolean[]{false,false,false,false,false,
    false,false,false,false,false,false};

    public PotentialClass() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String[] getEquipNames() {
        return equipNames;
    }

    public void setAvailOnEquip(String equip, boolean isAvail) {
        if (equip.equals("all")) {
            for (int i = 0; i < equipNames.length; i++) {
                availOnEquip[i] = isAvail;
            }
            return;
        }
        if (equip.equals("Armor")) {
            availOnEquip[0] = isAvail;
            availOnEquip[1] = isAvail;
            availOnEquip[2] = isAvail;
            availOnEquip[3] = isAvail;
            availOnEquip[4] = isAvail;
            availOnEquip[10] = isAvail;
            return;
        }
        for (int i = 0; i < equipNames.length; i++) {
            if (equip.equals(equipNames[i])) {
                availOnEquip[i] = isAvail;
                return;
            }
        }

    }


    public boolean isAvailable(String equip){
        for (int i = 0; i < equipNames.length; i++) {
            if (equip.equals(equipNames[i])) {
                return availOnEquip[i];
            }
        }
        return false;
    }

}
