package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, ScientificCalculator.squareRoot(16.0), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.factorial(-1);
        });
        assertTrue(exception.getMessage().contains("negative"));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, ScientificCalculator.naturalLog(Math.E), 0.0001);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.naturalLog(0);
        });
        assertTrue(exception.getMessage().contains("positive"));
    }

    @Test
    public void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2.0, 3.0), 0.0001);
    }
}
