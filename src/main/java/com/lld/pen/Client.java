package com.lld.pen;

import com.lld.pen.pen.BallPen;
import com.lld.pen.pen.Pen;
import com.lld.pen.pen.content.Refill;
import com.lld.pen.strategy.SmoothWritingStrategy;

public class Client {
    public static void main(String[] args) {
        Pen ballPen = new BallPen(new SmoothWritingStrategy(), new Refill());
        ballPen.write();
    }
}
