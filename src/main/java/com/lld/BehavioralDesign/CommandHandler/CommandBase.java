package com.lld.BehavioralDesign.CommandHandler;

public abstract class CommandBase {
    protected Soldier soldier;
    public CommandBase(Soldier soldier){
        this.soldier=soldier;
    }
    public abstract void action();
}


