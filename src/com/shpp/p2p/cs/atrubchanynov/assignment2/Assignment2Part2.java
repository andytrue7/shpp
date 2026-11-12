package com.shpp.p2p.cs.atrubchanynov.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    private static final double CIRCLE_DIAMETER = 90;

    public void run() {
        double w = getWidth();
        double h = getHeight();
        double d = CIRCLE_DIAMETER;
        double r = d / 2;

        drawCircle(0, 0);
        drawCircle(w - d, 0);
        drawCircle(0, h - d);
        drawCircle(w - d, h - d);

        drawRect(r, r, w - d, h - d);
    }

    private void drawCircle(double x, double y) {
        GOval circle = new GOval(x, y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        circle.setFilled(true);
        circle.setColor(Color.BLACK);
        add(circle);
    }

    private void drawRect(double x, double y, double width, double height) {
        GRect rect = new GRect(x, y, width, height);
        rect.setFilled(true);
        rect.setColor(Color.WHITE);
        add(rect);
    }
}
