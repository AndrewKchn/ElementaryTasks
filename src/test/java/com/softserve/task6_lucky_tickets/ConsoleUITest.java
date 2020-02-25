package com.softserve.task6_lucky_tickets;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleUITest {


    @Test
    public void addTicketToInputData() {
        String numberOfTicket = "123456";

        boolean expected = new ConsoleUI().addTicketToInputData(numberOfTicket);

        assertEquals(expected, true);
    }

    @Test
    public void inputTicketsForCount() {
    }

    @Test
    public void showResult() {
    }
}