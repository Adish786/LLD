package com.lld.BehavioralDesign.MementoMethodPattern;

public class ConfigurationOriginator {
    int height;
    int width;
    public ConfigurationOriginator(int height,int width){
        this.height=height;
        this.width=width;
    }

    public void setHeight(int height){
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;

    }
public  ConfigurationMemento createMemento(){
       return new ConfigurationMemento(this.height,this.width);
    }

    public void restoreMemento(ConfigurationMemento restore){
        this.height= restore.height;
        this.width= restore.width;
    }
}
