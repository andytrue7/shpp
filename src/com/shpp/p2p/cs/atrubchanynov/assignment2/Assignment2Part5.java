package com.shpp.p2p.cs.atrubchanynov.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {
        drawBoxes();
    }

    /**
     * Draws boxes in a table view
     */
    private void drawBoxes() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                drawBox(calcPosX(j), calcPosY(i));
            }
        }
    }

    /**
     * Draws a rectancle based on the provided x, y coordinates
     * @param posX The x coord of the up-left corner of the box
     * @param posY The y coord of the up-left corner of the box
     */
    private void drawBox(double posX, double posY) {
        GRect rect = new GRect(posX, posY, BOX_SIZE, BOX_SIZE);
        rect.setFilled(true);
        add(rect);
    }

    /**
     * Calculates the x coordinate to place a box in column counting box spacing
     * @param colIdx the index of the column starting from 0
     * @return the x coordinate of the box
     */
    private double calcPosX(int colIdx) {
        double centralPosX = (getWidth() - BOX_SIZE) / 2;
        double offsetX = BOX_SIZE * ((double) NUM_COLS / 2 - colIdx);

        return centralPosX - offsetX + BOX_SPACING * colIdx;
    }

    /**
     * Calculates the y coordinate to place a box in a row counting box spacing
     *
     * @param rowIdx the index of the row starting from 0
     * @return the y coordinate of the box
     */
    private double calcPosY(int rowIdx) {
        double centralPosY = (getHeight() - BOX_SIZE) / 2;
        double offsetY = BOX_SIZE * ((double) NUM_ROWS / 2 - rowIdx);

        return centralPosY - offsetY + BOX_SPACING * rowIdx;
    }
}
