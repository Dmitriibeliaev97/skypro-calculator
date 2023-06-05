package pro.sky.skyprocalculator.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprocalculator.exceptions.DivisionByZero;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public Integer sum(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Нет входных значений");
        }
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Нет входных значений");
        }
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Нет входных значений");
        }
        return num1 * num2;
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num1 == null && num2 == null) {
            throw new NullPointerException("Нет входных значений");
        }
        if (num2 == 0) {
            throw new DivisionByZero("Делить на 0 нельзя");
        }
        return (double) (num1 / num2);

    }
}
