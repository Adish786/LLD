package com.lld.BehavioralDesign.CommandHandler;

public class MoveBackwardCommand extends CommandBase {

    public MoveBackwardCommand(Soldier soldier) {
        super(soldier);
    }

    @Override
    public void action() {
        soldier.moveBackward();

    }
}
