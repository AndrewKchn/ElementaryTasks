package com.softserve.task6_happy_tickets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CounterOfLuckyTicket {
    private Ticket first;
    private Ticket last;
    public int easyWay;
    public int difficultWay;

    private static final int NUMBER_LENGTH = 6;
    private static final int AMOUNT_TICKETS = 2;

    private CounterOfLuckyTicket(List<Ticket> tickets) {
        this.first = tickets.get(0);
        this.last = tickets.get(1);
        easyWay = countEasyWay();
        difficultWay = countDifficultWay();
    }

    public static CounterOfLuckyTicket create(List<Ticket> inputTickets) {
        Collections.sort(inputTickets);
        return new CounterOfLuckyTicket(inputTickets);
    }

    private int countEasyWay() {
        int first = this.first.getNumber();
        int last = this.last.getNumber();
        int count = 0;
        for (int i = first; i <= last; i++) {
            if (isEasyWayLucky(numberToArray(i))) count++;
        }
        return count;
    }

    private int countDifficultWay() {
        int first = this.first.getNumber();
        int last = this.last.getNumber();
        int count = 0;
        for (int i = first; i <= last; i++) {
            if (isDifficultWayLucky(numberToArray(i))) count++;
        }
        return count;
    }

    private static int[] numberToArray(int number) {
        int[] result = new int[NUMBER_LENGTH];
        int tempNum = number;
        for (int i = NUMBER_LENGTH - 1; i >= 0; i--) {
            result[i] = tempNum % 10;
            tempNum = tempNum / 10;
        }
        return result;
    }

    private static boolean isEasyWayLucky(int[] arrayNumber) {
        int firstHalfSum = 0;
        int lastHalfSum = 0;
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            if (i < 3) firstHalfSum += arrayNumber[i];
            else lastHalfSum += arrayNumber[i];
        }
        return firstHalfSum == lastHalfSum;
    }

    private static boolean isDifficultWayLucky(int[] arrayNumber) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            if (i % 2 == 0) evenSum += arrayNumber[i];
            else oddSum += arrayNumber[i];
        }
        return evenSum == oddSum;
    }

    public int getResult() {
        return easyWay - difficultWay;
    }
}
