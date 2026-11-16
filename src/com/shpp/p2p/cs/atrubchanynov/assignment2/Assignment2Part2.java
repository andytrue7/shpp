package com.shpp.p2p.cs.atrubchanynov.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Contains constants, methods to create an optic illusion with circles and a rectangle
 */
public class Assignment2Part2 extends WindowProgram {

    /* The default W and H of the window. These constants will tell Java to
     * create a window whose size is *approximately* given by these dimensions. You should
     * not directly use these constants in your program; instead, use getWidth() and
     * getHeight(), which return the *exact* width and height of the window.
     */
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;

    /*
     * The circle diameter to define a circle size
     */
    private static final double CIRCLE_DIAMETER = 90;

    public void run() {
        double width = getWidth();
        double height = getHeight();
        double diameter = CIRCLE_DIAMETER;
        double radius = diameter / 2;

        drawCircle(0, 0);
        drawCircle(width - diameter, 0);
        drawCircle(0, height - diameter);
        drawCircle(width - diameter, height - diameter);

        drawRect(radius, radius, width - diameter, height - diameter);
    }

    /**
     * Draws a circle
     *
     * @param x The x coord of the up-left corner of the bounding box for the circle
     * @param y The y coord of the up-left corner of the bounding box for the circle
     */
    private void drawCircle(double x, double y) {
        GOval circle = new GOval(x, y, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
        circle.setFilled(true);
        circle.setColor(Color.BLACK);
        add(circle);
    }

    /**
     * Draws a rectangle
     *
     * @param x The x coord of the up-left corner of the rectangle
     * @param y The y coord of the up-left corner of the rectangle
     * @param width The rectangle width as double
     * @param height The rectangle height as double
     */
    private void drawRect(double x, double y, double width, double height) {
        GRect rect = new GRect(x, y, width, height);
        rect.setFilled(true);
        rect.setColor(Color.WHITE);
        add(rect);
    }
}
