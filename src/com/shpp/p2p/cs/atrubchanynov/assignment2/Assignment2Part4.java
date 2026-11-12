package com.shpp.p2p.cs.atrubchanynov.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Contains constans and methods to draw a tricolor flag with a label on the window.
 */
public class Assignment2Part4 extends WindowProgram {
    private static final double FLAG_STRIPE_WIDTH = 80;
    private static final double FLAG_STRIPE_HEIGHT = 150;
    private static final String FLAG_LABEL_TEXT = "Flag of Belgium";
    private static final String FLAG_LABEL_FONT_NAME = "Arial";
    private static final int FLAG_LABEL_FONT_SIZE = 20;

    public void run() {
        double posX = (getWidth() - FLAG_STRIPE_WIDTH) / 2;
        double posY = (getHeight() - FLAG_STRIPE_HEIGHT) / 2;

        drawFlag(posX, posY);
        printFlagLabel();
    }

    /**
     * Draws a tricolor flag
     *
     * @param posX The x coord of the up-left corner of the flag
     * @param posY The y coord of the up-left corner
     */
    private  void drawFlag (double posX, double posY) {
        drawRect(posX, posY, Color.YELLOW);
        drawRect(posX - FLAG_STRIPE_WIDTH, posY, Color.BLACK);
        drawRect(posX + FLAG_STRIPE_WIDTH, posY, Color.RED);
    }

    /**
     * Draws a rectangle
     *
     * @param posX The x coord of the up-left corner of the rectangle
     * @param posY The y coord of the up-left corner
     * @param color The color of the rectangle
     */
    private void drawRect(double posX, double posY, Color color) {
        GRect rect = new GRect(posX, posY, FLAG_STRIPE_WIDTH, FLAG_STRIPE_HEIGHT);

        rect.setFilled(true);
        rect.setColor(color);
        add(rect);
    }

    /**
     * Prints a flag label
     */
    private void printFlagLabel() {
        GLabel label = new GLabel(FLAG_LABEL_TEXT);
        label.setFont(new Font(FLAG_LABEL_FONT_NAME, Font.BOLD, FLAG_LABEL_FONT_SIZE));
        add(label);

        label.setLocation(getWidth() - label.getWidth(), getHeight() - label.getHeight());
    }
}
