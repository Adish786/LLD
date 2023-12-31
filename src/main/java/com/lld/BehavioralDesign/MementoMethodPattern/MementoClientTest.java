package com.lld.BehavioralDesign.MementoMethodPattern;

public class MementoClientTest {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        //initiate state of the originator
        ConfigurationOriginator originator = new ConfigurationOriginator(5,10);
        //save it
        ConfigurationMemento snapshot1 =  originator.createMemento();
        //add it to history
        careTaker.addMemento(snapshot1);
        //originator changing to new state
        originator.setHeight(7);
        originator.setWidth(12);
        //save it
        ConfigurationMemento snapshot2 = originator.createMemento();
        //add it to history
        careTaker.addMemento(snapshot2);
        //originator changing to new state
        originator.setHeight(9);
        originator.setWidth(18);
        //UNDO
        ConfigurationMemento restoreState = careTaker.undo();
        originator.restoreMemento(restoreState);
        System.out.println("height :" +originator.height+ "widht : " +originator.width);
    }
}
