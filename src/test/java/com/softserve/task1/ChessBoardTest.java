package com.softserve.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void create() {
        ChessBoard chessBoard = ChessBoard.create(new int[]{3,3});




    }

    @Test
    public void testToString() {
        ChessBoard chessBoard = ChessBoard.create(new int[]{3,3});

        String expected = "* *\n * \n* *\n";
        String actual = chessBoard.toString();

        assertEquals(expected,actual);
    }
}