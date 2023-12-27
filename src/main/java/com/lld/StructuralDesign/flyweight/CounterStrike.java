package com.lld.StructuralDesign.flyweight;

import java.util.Random;

public class CounterStrike {
    private static String [] playerType = {"Terrorist","CounterTerrorist"};
    private static String[] weapons = {"AK-47","Maverick","Gut Knife","Desert Eagle"};


    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            Playper p = PlayerFactory.getPlayers(getRandomPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();
        }
    }

    public static String getRandomPlayerType(){
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];

    }
    public static String getRandWeapon(){
        Random w = new Random();
        int randInt = w.nextInt(weapons.length);
        return weapons[randInt];
    }
}
