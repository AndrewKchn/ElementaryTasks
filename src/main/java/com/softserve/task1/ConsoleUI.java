package com.softserve.task1;

import java.util.Scanner;


class ConsoleUI {
    private static Scanner scanner = new Scanner(System.in);

    public int[] getChessBoardInputSize() {
        return chessBoardInputSize;
    }

    private int[] chessBoardInputSize = new int[2];


    private static String INFO = "This program creates and show a chessboard in the console.";
    private static String END = "Thank you. Bye.";
    private static final String ERROR_MESSAGE = "Board sizes must be integer values greater than zero. Please try again.";
    private static final String MESSAGE_WIDTH = "Please enter a board width.";
    private static final String MESSAGE_HEIGHT = "Please enter a board height.";

    public ConsoleUI() {
        show(INFO);
    }

    private static int consoleDataInput() {
        String consoleIn;
        do {
            consoleIn = scanner.nextLine();
            if (!DataValidator.isCorrectForChessBoard(consoleIn)) {
                show(ERROR_MESSAGE);
            }
        } while (!DataValidator.isCorrectForChessBoard(consoleIn));
        return Integer.parseInt(consoleIn);
    }

    public int[] inputChessBoardParam() {
        show(MESSAGE_WIDTH);
        chessBoardInputSize[0] = consoleDataInput();// size width
        show(MESSAGE_HEIGHT);
        chessBoardInputSize[1] = consoleDataInput(); // size height
        return chessBoardInputSize;
    }

    public static void show(String in) {
        System.out.println(in);
    }


}
