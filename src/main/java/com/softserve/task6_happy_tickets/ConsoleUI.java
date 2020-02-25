package com.softserve.task6_happy_tickets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConsoleUI {
    private List<Ticket> dataForCounter = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    private static final String INFO = "This program can calculate the number of lucky tickets between two given.";
    private static final String END = "Thank you. Bye.";
    private static final int AMOUNT_TICKETS = 2;
    private static final String MESSAGE = "Please enter the number of ticket";
    private static final String ERROR_MESSAGE = "Invalid entry for ticket number.\n" +
            "The ticket number should be only six integer values.";
    private static final String WELL_DONE = "Well done.";
/*


*/

    public ConsoleUI() {
        show(INFO);
    }

    public List<Ticket> getDataForCounter(){
        return dataForCounter;
    }

    private static String inputData(){
        String validData;
        do {
            show(MESSAGE);
            validData = scanner.nextLine();
            if (!DataValidator.isCorrectForTicket(validData)) {
                show(ERROR_MESSAGE);
            }
        } while (!DataValidator.isCorrectForTicket(validData));
        show(WELL_DONE);
        return validData;
    }

    private int stringToInt(String stringInputData) throws NumberFormatException {
        return Integer.parseInt(stringInputData);
    }

    private boolean addTicketToInputData(String validData) {
        return dataForCounter.add(new Ticket(stringToInt(validData)));
    }

    public void inputTicketsForCount(){
        for (int i = 0; i < AMOUNT_TICKETS; i++){
            addTicketToInputData(inputData());
        }
    }

    public static void show(String output){
        System.out.println(output);
    }

    public void showResult(CounterOfLuckyTicket result){
        int resultOfCount = result.getResult();
        if (resultOfCount == 0) {
            show("Ways are equal");
        } else if (resultOfCount > 0) {
            show("Easy way won.");
        } else show("Difficult way won");
        show("Between tickets are " + result.easyWay + " easy way lucky\n" +
                "and " + result.difficultWay + " difficult way lucky");
    }
}
