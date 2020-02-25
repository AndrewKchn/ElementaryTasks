package com.softserve.task6_happy_tickets;

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


    public static void main(String[] args) {

        ConsoleUI consoleTickets = new ConsoleUI();
        consoleTickets.inputTicketsForCount();
        CounterOfLuckyTicket counter = CounterOfLuckyTicket.create(consoleTickets.getDataForCounter());
        consoleTickets.showResult(counter);

    }
}
