package me.sonia_hu.cubesimulator;

import java.util.Random;

/**
 * Created by shu on 8/16/2016.
 */
public class Potential {
    public static PotentialStatTypicalClass typicalStatPotentials[] = new PotentialStatTypicalClass[13];
    public static PotentialStatAllStatsClass allStatPotentials[] = new PotentialStatAllStatsClass[1];


    public static void initialize(){

        /* Creating Typical Stat Potentials */
        PotentialStatTypicalClass potStr = new PotentialStatTypicalClass("STR");
        potStr.setAvailOnEquip("all",true);
        typicalStatPotentials[0] = potStr;

        PotentialStatTypicalClass potDex = new PotentialStatTypicalClass("DEX");
        potDex.setAvailOnEquip("all",true);
        typicalStatPotentials[1] = potDex;

        PotentialStatTypicalClass potInt = new PotentialStatTypicalClass("INT");
        potInt.setAvailOnEquip("all",true);
        typicalStatPotentials[2] = potInt;

        PotentialStatTypicalClass potLuk = new PotentialStatTypicalClass("LUK");
        potLuk.setAvailOnEquip("all",true);
        typicalStatPotentials[3] = potLuk;

        PotentialStatTypicalClass potAcc = new PotentialStatTypicalClass("Accuracy");
        potAcc.setAvailOnEquip("all",true);
        typicalStatPotentials[4] = potAcc;

        PotentialStatTypicalClass potAvoid = new PotentialStatTypicalClass("Avoidability");
        potAvoid.setAvailOnEquip("all",true);
        typicalStatPotentials[5] = potAvoid;

        PotentialStatTypicalClass potAtk = new PotentialStatTypicalClass("Attack");
        potAtk.setAvailOnEquip("Weapon",true);
        potAtk.setAvailOnEquip("Secondary",true);
        potAtk.setAvailOnEquip("Emblem",true);
        typicalStatPotentials[6] = potAtk;

        PotentialStatTypicalClass potMatk = new PotentialStatTypicalClass("Magic Attack");
        potMatk.setAvailOnEquip("Weapon",true);
        potMatk.setAvailOnEquip("Secondary",true);
        potMatk.setAvailOnEquip("Emblem",true);
        System.out.println(potMatk.isAvailable("Top"));
        typicalStatPotentials[7] = potMatk;

        PotentialStatTypicalClass potDmg = new PotentialStatTypicalClass("Damage");
        potDmg.setAvailOnEquip("Weapon",true);
        potDmg.setAvailOnEquip("Secondary",true);
        potDmg.setAvailOnEquip("Emblem",true);
        typicalStatPotentials[8] = potDmg;

        PotentialStatTypicalClass potMaxHP = new PotentialStatTypicalClass("Max HP");
        potMaxHP.setAvailOnEquip("Armor",true);
        potMaxHP.setAvailOnEquip("Accessory",true);
        typicalStatPotentials[9] = potMaxHP;

        PotentialStatTypicalClass potMaxMP = new PotentialStatTypicalClass("Max MP");
        potMaxMP.setAvailOnEquip("Armor",true);
        potMaxMP.setAvailOnEquip("Accessory",true);
        typicalStatPotentials[10] = potMaxMP;

        PotentialStatTypicalClass potWepDef = new PotentialStatTypicalClass("Weapon Defense");
        potWepDef.setAvailOnEquip("Armor",true);
        potWepDef.setAvailOnEquip("Accessory",true);
        typicalStatPotentials[11] = potWepDef;

        PotentialStatTypicalClass potMagDef = new PotentialStatTypicalClass("Magic Defense");
        potMagDef.setAvailOnEquip("Armor",true);
        potMagDef.setAvailOnEquip("Accessory",true);
        typicalStatPotentials[12] = potMagDef;

        /* Creating All Stat Potential */
        PotentialStatAllStatsClass potAllStat = new PotentialStatAllStatsClass("All Stats");
        potAllStat.setAvailOnEquip("all", true);
        allStatPotentials[0] = potAllStat;


    }

    public static int randInt(int min, int max) { /* to generate random numbers */
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String generatePrimary(int equip, String equipType){ /* to generate Primary potential lines */
        PotentialStatTypicalClass chosenPot;
        while(true) {
            int index = randInt(0, typicalStatPotentials.length - 1);
            chosenPot = typicalStatPotentials[index];
            if ((equip >= chosenPot.getMinimumLevel()) && (chosenPot.isAvailable(equipType))) {
                break;
            }
        }
        return chosenPot.getName() + " + " + chosenPot.getLegendaryValue(equip) + chosenPot.getValueTypeIdentifier();
    }

    public static String generateSecondary(int equip, String equipType){ /* to generate Secondary potential lines */
        PotentialStatTypicalClass chosenPot;
        while(true) {
            int index = randInt(0, typicalStatPotentials.length - 1);
            chosenPot = typicalStatPotentials[index];
            if ((equip >= chosenPot.getMinimumLevel()) && (chosenPot.isAvailable(equipType))) {
                break;
            }
        }
        return chosenPot.getName() + " + " + chosenPot.getUniqueValue(equip) + chosenPot.getValueTypeIdentifier();
    }

    public static String generate(int line, int equip, String equipType) {
        int primaryChance = 0;
        int primaryChanceMax = 200;
        if (line == 1) {
            primaryChance = 200;
            if (randInt(0, primaryChanceMax - 1) < primaryChance) {
                return generatePrimary(equip, equipType);
            } else {
                return generateSecondary(equip, equipType);
            }
        }
        else if (line == 2){
            primaryChance = 22;
            if (randInt(0, primaryChanceMax - 1) < primaryChance) {
                return generatePrimary(equip, equipType);
            }
            else {
                return generateSecondary(equip, equipType);
            }
        }
        else {
            primaryChance = 3;
            if (randInt(0, primaryChanceMax - 1) < primaryChance) {
                return generatePrimary(equip, equipType);
            }
            else {
                return generateSecondary(equip, equipType);
            }
        }
    }
}
