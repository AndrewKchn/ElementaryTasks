package com.softserve.task6_lucky_tickets;

public class Ticket implements Comparable<Ticket> {
    private int number;

    public Ticket(int number){
        if (number < 0) throw new IllegalArgumentException();
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ticket№ " + String.format("%06d",number);
    }

    @Override
    public int compareTo(Ticket o) {
        return this.getNumber() - o.getNumber();
    }
}
