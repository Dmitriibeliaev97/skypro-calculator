package pro.sky.skyprocalculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    static Integer x = 5;
    static Integer y = 5;

    public static Stream<Arguments> paramsForTests() {
        return Stream.of(
                Arguments.of(x, y)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void sum(Integer x, Integer y) {
        Integer result = out.sum(5, 5);
        assertEquals(x + y, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void minus(Integer x, Integer y) {
        Integer result = out.minus(5, 5);
        assertEquals(x - y, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void multiply(Integer x, Integer y) {
        Integer result = out.multiply(5, 5);
        assertEquals(x * y, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void divide(Integer x, Integer y) {
        Double result = out.divide(5, 5);
        assertEquals(x / y, result);
    }
}