package com.softserve.task6_happy_tickets;

public class Ticket {
    private int number;

    Ticket(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ticket№ " + String.format("%06d",number);
    }
}
