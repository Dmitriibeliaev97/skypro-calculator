package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public Double sum(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double minus(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    public Double divide(Double num1, Double num2) {
        return num1 / num2;

    }
}
