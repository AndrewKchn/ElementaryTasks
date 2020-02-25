package com.softserve.task1;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

    private List<ChessField> playField = new ArrayList<>();
    private int[] size = new int[2];// [{width,height}]


    private ChessBoard() {
    }

    public static ChessBoard create(int[] size) {
        ChessBoard result = new ChessBoard();
        result.size = size;
        int boardWidth = size[0] + 'a' - 1;
        int boardHeight = size[1];
        for (int h = 1; h <= boardHeight; h++) {
            for (char w = 'a'; w <= boardWidth; w++) {
                result.playField.add(new ChessField(w,h));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        char maxWidthCoordinate = (char)('a' + size[0] - 1);
        for (ChessField cf : playField) {
            if (cf.getCoordinateWidth() == maxWidthCoordinate) result.append(cf).append("\n");
            else result.append(cf);
        }
        return new String(result);
    }
}
