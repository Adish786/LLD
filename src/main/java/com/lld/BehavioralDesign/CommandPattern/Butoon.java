package com.lld.BehavioralDesign.CommandPattern;

public class Butoon {
    private Command command;
    private String text;

    public Butoon(Command command,String text){
        this.command=command;
        this.text=text;
    }
    public void click(){
        this.command.execute();
    }
}
