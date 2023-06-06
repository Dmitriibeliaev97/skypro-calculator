package pro.sky.skyprocalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.skyprocalculator.exceptions.DivisionByZero;

import java.io.IOException;

import static org.apache.el.lang.ELArithmetic.divide;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    Integer x;
    Integer y;

    @BeforeEach
    public void setUp() {
        x = 5;
        y = 5;
    }

    @Test
    public void testSum() {
        Integer result = out.sum(5, 5);
        assertEquals(x + y, result);
    }

    @Test
    public void testMinus() {
        Integer result = out.minus(5, 5);
        assertEquals(x - y, result);
    }

    @Test
    public void testMultiply() {
        Integer result = out.multiply(5, 5);
        assertEquals(x * y, result);
    }

    @Test
    public void testDivide() {
        Double result = out.divide(5, 5);
        assertEquals(x / y, result);
    }

    @Test
    public void tesDivideByZero() {
        assertThrows(DivisionByZero.class, () -> out.divide(5, 0));
    }
}