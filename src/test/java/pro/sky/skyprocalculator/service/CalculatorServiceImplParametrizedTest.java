package pro.sky.skyprocalculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> paramsForTests() {
        return Stream.of(
                Arguments.of(5, 5),
                Arguments.of(5, 10),
                Arguments.of(10, 5),
                Arguments.of(15, 25),
                Arguments.of(-5, 55)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void sum(Integer x, Integer y) {
        Integer exxpectedSum = x + y;
        Integer actualSum = calculatorService.sum(x, y);
        assertEquals(exxpectedSum, actualSum);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void minus(Integer x, Integer y) {
        Integer expectedMinus = x - y;
        Integer actualMinus = calculatorService.minus(x, y);
        assertEquals(expectedMinus, actualMinus);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void multiply(Integer x, Integer y) {
        Integer expectedMultiply = x * y;
        Integer actualMultiply = calculatorService.multiply(x, y);
        assertEquals(expectedMultiply, actualMultiply);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void divide(Integer x, Integer y) {
        Integer expectedDivide = x / y;
        Integer actualDivide = calculatorService.divide(x, y);
        assertEquals(expectedDivide, actualDivide);
    }
}