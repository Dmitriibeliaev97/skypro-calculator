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
        y = 0;
    }

    @Test
    public void testSum() {
        assertNotNull(x);
        assertNotNull(y);
    }

    @Test
    public void testMinus() {
        assertNotNull(x);
        assertNotNull(y);
    }

    @Test
    public void testMultiply() {
        assertNotNull(x);
        assertNotNull(y);
    }

    @Test
    public void testDivide() {
        assertNotNull(x);
        assertNotNull(y);
        assertThrows(DivisionByZero.class, () -> out.divide(x, y));
    }
}