package com.lld.BehavioralDesign.CommandHandler;

public class JumpCommand extends CommandBase{
    public JumpCommand(Soldier soldier) {
        super(soldier);
    }

    @Override
    public void action() {
        soldier.jump();

    }
}
