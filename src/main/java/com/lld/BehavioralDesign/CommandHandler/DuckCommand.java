package com.lld.BehavioralDesign.CommandHandler;

public class DuckCommand extends CommandBase{
    public DuckCommand(Soldier soldier) {
        super(soldier);
    }

    @Override
    public void action() {
        soldier.duck();

    }
}
