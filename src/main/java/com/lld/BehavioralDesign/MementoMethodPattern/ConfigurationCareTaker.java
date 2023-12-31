package com.lld.BehavioralDesign.MementoMethodPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();
    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }
    public ConfigurationMemento undo() {
        if (!history.isEmpty()) {
            int lastMementoIndex = history.size() - 1;
            //get the last memento from the list
            ConfigurationMemento lastMemento = history.get(lastMementoIndex);
            //restore the last memento from the list now
            history.remove(lastMementoIndex);
            return lastMemento;
        }
        return null;
    }

}
