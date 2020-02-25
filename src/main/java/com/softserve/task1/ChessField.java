package com.softserve.task1;

public class ChessField {
    private int width;
    private int height;
    private String color;

    private final static String BLACK = "*";
    private final static String WHITE = " ";

    ChessField(int width, int height) {
        this.width = width;
        this.height = height;
        paintChessField();
    }

    private void paintChessField() {
        if ((this.width + this.height) % 2 == 0) color = BLACK;
        else color = WHITE;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return color;
    }
}
