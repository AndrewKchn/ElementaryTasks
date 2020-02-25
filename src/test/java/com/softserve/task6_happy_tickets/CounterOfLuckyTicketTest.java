package com.softserve.task6_happy_tickets;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CounterOfLuckyTicketTest {

    @Test
    public void testCountEasyWay() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(123123));
        tickets.add(new Ticket(123223));
        CounterOfLuckyTicket result = CounterOfLuckyTicket.create(tickets);

        int expectedEasyWay = 7;
        int actualEasyWay = result.easyWay;

        assertEquals(expectedEasyWay,actualEasyWay);
    }

    @Test
    public void testCountDifficultWay() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(123123));
        tickets.add(new Ticket(123223));
        CounterOfLuckyTicket result = CounterOfLuckyTicket.create(tickets);

        int expectedEasyWay = 10;
        int actualEasyWay = result.difficultWay;

        assertEquals(expectedEasyWay,actualEasyWay);
    }

    @Test
    public void testGetResult() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(123123));
        tickets.add(new Ticket(123223));

        CounterOfLuckyTicket result = CounterOfLuckyTicket.create(tickets);

        int expected = -3;
        int actual = result.getResult();

        assertEquals(expected,actual);
    }

    @Test
    public void testCountWithReverse() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(123223));
        tickets.add(new Ticket(123123));

        CounterOfLuckyTicket result = CounterOfLuckyTicket.create(tickets);

        int expected = -3;
        int actual = result.getResult();

        assertEquals(expected,actual);
    }

    @Test
    public void testCountEquals() {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(122286));
        tickets.add(new Ticket(122323));

        CounterOfLuckyTicket result = CounterOfLuckyTicket.create(tickets);

        int expected = 0;
        int actual = result.getResult();

        assertEquals(expected,actual);
    }




}