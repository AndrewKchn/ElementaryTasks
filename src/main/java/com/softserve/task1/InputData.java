package com.softserve.task1;

import java.util.Scanner;
import com.softserve.util.Display;

class InputData {

    private static String ERROR_MESSAGE = "Board sizes must be integer values greater than zero. Please try again.";
    private static String MESSAGE_WIDHT = "Please enter a board width.";
    private static String MESSAGE_HEIGHT = "Please enter a board height.";

    private static boolean dataIsCorrect(String inputDate) {
        int data;
        try {
            data = Integer.parseInt(inputDate);
        } catch (NumberFormatException e) {
            return false;
        }
        return (data > 0);
    }

    static int consoleDataInput() {
        String consoleIn;
        Scanner scanner = new Scanner(System.in);
        do {
            consoleIn = scanner.nextLine();
            if (!dataIsCorrect(consoleIn)) {
                Display.show(ERROR_MESSAGE);
            }
        } while (!dataIsCorrect(consoleIn));
        return Integer.parseInt(consoleIn);
    }

    static ChessField chessBoardInputParam() {
        Display.show(MESSAGE_WIDHT);
        int weight = consoleDataInput();
        Display.show(MESSAGE_HEIGHT);
        int height = consoleDataInput();
        return new ChessField(weight, height);
    }
}
