package io.turntabl.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void addTest() {
        int actual = Calculator.add(2, 4);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void addTest_forneg() {
        int actual = Calculator.add(-2, -4);
        int expected = -6;
        assertEquals(expected, actual);
    }
}
