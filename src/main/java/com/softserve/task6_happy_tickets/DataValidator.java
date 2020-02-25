package com.softserve.task6_happy_tickets;

public class DataValidator {

    static boolean isCorrectForTicket(String s){
        return s.matches("\\d{6}");
    }

}
