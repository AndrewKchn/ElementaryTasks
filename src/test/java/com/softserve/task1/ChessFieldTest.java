package com.softserve.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessFieldTest {

    @Test
    public void testToStringBlackField() {
        ChessField a1 = new ChessField('a',1);

        String expected = "*";
        String actual = a1.toString();

        assertEquals(expected,actual);
    }

    @Test
    public void testToStringWhitefield() {
        ChessField a1 = new ChessField('b',1);

        String expected = " ";
        String actual = a1.toString();

        assertEquals(expected,actual);
    }
}