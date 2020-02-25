package com.softserve.task6_lucky_tickets;

public class DataValidator {

    public static boolean isCorrectForTicket(String s){
        return s.matches("\\d{6}");
    }

}
