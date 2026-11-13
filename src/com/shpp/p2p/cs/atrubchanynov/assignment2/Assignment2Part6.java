package com.shpp.p2p.cs.atrubchanynov.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Contains constants and methods to draw a Caterpillar on the window
 */
public class Assignment2Part6 extends WindowProgram {
    /* The oval width and height. */
    private static final double OVAL_WIDTH = 90;
    private static final double OVAL_HEIGHT = 90;

    /* The num of ovals the Caterpillar consists of */
    private static final int OVAL_NUMS = 6;

    /* The initial coordinates which are a starting point for the Caterpillar posistioning  */
    private static final double INIT_POSX = 20;
    private static final double INIT_POSY = 100;

    /* Constants controlling the relative positions of the oval to the previous one*/
    private static final double OFFSETX = 60;
    private static final double OFFSETY = 30;

    public void run() {
        drawCaterpillar();
    }

    /**
     * Draws a Caterpillar on the window
     */
    private void drawCaterpillar() {
        double posX = INIT_POSX;
        double posY = INIT_POSY;

        for (int i = 0; i < OVAL_NUMS; i++) {
            posX += OFFSETX;

            if (i % 2 != 0) {
                drawOval(posX, posY - OFFSETY);
            } else {
                drawOval(posX, posY);
            }

        }
    }

    /**
     * Draws an oval based on the provided coordinates.
     *
     * @param posX The x coord of the up-left corner of the bounding box for the oval
     * @param posY The y coord of the up-left corner of the bounding box for the oval
     */
    private void drawOval(double posX, double posY) {
        GOval oval = new GOval(posX, posY, OVAL_WIDTH, OVAL_HEIGHT);
        oval.setFilled(true);
        oval.setColor(Color.RED);
        oval.setFillColor(Color.GREEN);

        add(oval);
    }
}
