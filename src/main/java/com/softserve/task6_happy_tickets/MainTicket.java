package com.softserve.task6_happy_tickets;

import com.softserve.util.Display;

/*
Lucky tickets.

    Есть 2 способа подсчёта счастливых билетов:
    1. Простой — если на билете напечатано шестизначное число, и сумма первых трёх
цифр равна сумме последних трёх, то этот билет считается счастливым.
    2. Сложный — если сумма чётных цифр билета равна сумме нечётных цифр билета, то
билет считается счастливым.
    Определить программно какой вариант подсчёта счастливых билетов даст их большее
количество на заданном интервале.

    Входные параметры: min и max номер билета
    Выход: информация о победившем методе и количестве счастливых билетов для
каждого способа подсчёта.
*/

public class MainTicket {

    private static final String INFO = "This program can calculate the number of lucky tickets between two given.";
    private static final String END = "Thank you. Bye.";

    public static void main(String[] args) {
        Display.show(INFO);
        CounterOfLuckyTicket counter = CounterOfLuckyTicket.create();
        counter.getResult();
        Display.show(END);
    }
}
