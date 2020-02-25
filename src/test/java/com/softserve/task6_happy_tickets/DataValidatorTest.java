package com.softserve.task6_happy_tickets;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class DataValidatorTest {
    @Parameterized.Parameters(name = "{index}:IsCorrectForTicket({123456}=true)")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"-123456",false},
            {"12345",false},
            {"asdf",false},
            {"123 456",false},
            {"123456",true},
            {"012345",true}
        });
    }
    private String testInput;
    private boolean testExpected;
    public DataValidatorTest(String input,boolean expected){
        testInput = input;
        testExpected = expected;
    }


    @Test
    public void testIsCorrectForTicket() {
        assertEquals(testExpected,DataValidator.isCorrectForTicket(testInput));
    }
}