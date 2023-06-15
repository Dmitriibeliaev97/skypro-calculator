package pro.sky.skyprocalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.exceptions.DivisionByZero;
import pro.sky.skyprocalculator.service.CalculatorServiceImpl;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        try {
            return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
        } catch (NullPointerException e) {
            return "Нет входных значений!";
        }
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        try {
            return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
        } catch (NullPointerException e) {
            return "Нет входных значений!";
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        try {
            return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
        } catch (NullPointerException e) {
            return "Нет входных значений!";
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false
    ) Integer num2) {
        try {
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        } catch (DivisionByZero e) {
            return "Делить на 0 нельзя";
        } catch (NullPointerException e) {
            return "Нет входных значений!";
        }

    }

}
