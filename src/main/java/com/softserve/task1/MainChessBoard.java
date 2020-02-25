package com.softserve.task1;

import com.softserve.util.Display;

public class MainChessBoard {

    private static String INFO = "This program creates and show a chessboard in the console.";
    private static String END = "Thank you. Bye.";

    public static void main(String[] args) {
        Display.show(INFO);
        ChessBoard chessBoard = ChessBoard.create(InputData.chessBoardInputParam());
        Display.show(chessBoard.toString());
        Display.show(END);
    }
}
