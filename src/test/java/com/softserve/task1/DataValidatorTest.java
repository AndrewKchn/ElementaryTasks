package com.softserve.task1;

import com.softserve.task1.DataValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DataValidatorTest {
    @Parameterized.Parameters(name = "{index}: isCorrectForChessBoard( {0} ) - {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"-11", false},
                {"!", false},
                {" ", false},
                {"", false},
                {"1 4", false},
                {"12", true},
                {"01", true}
        });
    }

    private String testInput;
    private boolean testExpected;

    public DataValidatorTest(String input, boolean expected) {
        testInput = input;
        testExpected = expected;
    }

    @Test
    public void testIsCorrectForChessBoars() {
        assertEquals(testExpected, DataValidator.isCorrectForChessBoard(testInput));
    }
}
