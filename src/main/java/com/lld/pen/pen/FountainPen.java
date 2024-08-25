package com.lld.pen.pen;

import com.lld.pen.pen.content.Ink;
import com.lld.pen.pen.content.Nib;
import pen.strategy.WriteStrategy;

public class FountainPen extends Pen{
    Ink ink;
    Nib nib;

    public FountainPen(WriteStrategy writeStrategy, Ink ink, Nib nib) {
        super(writeStrategy);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        System.out.println("FountainPen!!");
        writeStrategy.writeBehaviour();
    }
}
