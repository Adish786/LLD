package com.lld.StructuralDesign.flyweight;

public class CounterTerrorist implements Playper{
    private final String TASK;
    private String weapon;
    public CounterTerrorist(){
        TASK = "DIFFUSE A BOMB";
    }
    @Override
    public void assignWeapon(String weapon) {
     this.weapon=weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon" +weapon+"|" +"Task is" +TASK);
    }
}
