package com.softserve.task1;

public class MainChessBoard {


    public static void main(String[] args) {
        ConsoleUI chessBoardUI = new ConsoleUI();
        chessBoardUI.inputChessBoardParam();
        ChessBoard chessBoard = ChessBoard.create(chessBoardUI.getChessBoardInputSize());
        chessBoardUI.show(chessBoard.toString());
    }
}
