package com.softserve.task1;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

    private List<ChessField> playField = new ArrayList<>();
    private ChessField size;


    private ChessBoard() {
    }

    static ChessBoard create(ChessField size) {
        ChessBoard result = new ChessBoard();
        result.size = size;
        for (int h = 0; h < size.getHeight(); h++) {
            for (int w = 0; w < size.getWidth(); w++) {
                result.playField.add(new ChessField(w,h));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (ChessField c : playField) {
            if (c.getWidth() == size.getWidth() - 1) result.append(c).append("\n");
            else result.append(c);
        }
        return new String(result);
    }
}
