package com.lld.pen.pen;

import com.lld.pen.pen.content.Cap;
import com.lld.pen.strategy.WriteStrategy;

public abstract class Pen {
    String name;
    String bodyColor;
    int length;
    int price;
    Cap cap;

    WriteStrategy writeStrategy;

    public Pen(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }
    public abstract void write();
}
