package com.softserve.task1;

public class ChessField {
    private int coordinateWidth;
    private int coordinateHeight;
    private String color;

    private final static String BLACK = "*";
    private final static String WHITE = " ";

    ChessField(int width, int height) {
        this.coordinateWidth = width;
        this.coordinateHeight = height;
        paintChessField();
    }

    private void paintChessField() {
        if ((this.coordinateWidth + this.coordinateHeight) % 2 == 0) color = BLACK;
        else color = WHITE;
    }

    int getCoordinateWidth() {
        return coordinateWidth;
    }

    int getCoordinateHeight() {
        return coordinateHeight;
    }

    @Override
    public String toString() {
        return color;
    }
}
