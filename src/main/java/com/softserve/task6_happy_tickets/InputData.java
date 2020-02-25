package com.softserve.task6_happy_tickets;

import com.softserve.util.Display;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InputData {

    private static final String MESSAGE = "Please enter the number of ticket";
    private static final String ERROR_MESSAGE = "Invalid entry for ticket number.\n" +
            "The ticket number should be only six integer values.";
    private static final String WELL_DONE = "Well done.";

    private static String inputData() {
        Scanner scanner = new Scanner(System.in);
        String validData;
        do {
            Display.show(MESSAGE);
            validData = scanner.nextLine();
            if (!DataValidator.isCorrectForTicket(validData)) {
                Display.show(ERROR_MESSAGE);
            }
        } while (!DataValidator.isCorrectForTicket(validData));
        Display.show(WELL_DONE);
        return validData;
    }

    private static int stringToInt(String stringInputData) {
        return Integer.parseInt(stringInputData);
    }

    static List<Ticket> inputTicketsNumbers(int amountTickets) {
        List<Ticket> result = new ArrayList<>();
        for (int i = 0; i < amountTickets; i++){
            result.add(new Ticket(stringToInt(inputData())));
        }
        return result;
    }

}
