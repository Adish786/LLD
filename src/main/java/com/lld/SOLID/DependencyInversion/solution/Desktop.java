package com.lld.SOLID.DependencyInversion.solution;

/* TODO  High-level modules should not depend on pow -level modules.Both should depend on abstractions.
    Abstractions should not depend on details . Details should depend on abstractions.
*/
public class Desktop {
    private Monitor monitor;
    private Keyboard keyboard;

    //Solution
    public Desktop(Keyboard keyBoard , Monitor monitor){
        this.monitor=monitor;
        this.keyboard=keyBoard;
    }

}
