package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String sum(@RequestParam(name = "num1", required = false) Double num1, @RequestParam(name = "num2", required = false) Double num2) {
        if (num1 == null || num2 == null) {
            return "Нет входных значений!";
        }
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    @GetMapping ("/minus")
    public String minus(@RequestParam (name = "num1", required = false) Double num1, @RequestParam (name = "num2", required = false) Double num2) {
        if (num1 == null || num2 == null) {
            return "Нет входных значений!";
        }
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping ("/multiply")
    public String multiply(@RequestParam (name = "num1", required = false) Double num1, @RequestParam (name = "num2", required = false) Double num2) {
        if (num1 == null || num2 == null) {
            return "Нет входных значений!";
        }
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping ("/divide")
    public String divide(@RequestParam (name = "num1", required = false) Double num1, @RequestParam (name = "num2", required = false
    ) Double num2) {
        if (num1 == null || num2 == null) {
            return "Нет входных значений!";
        }
        if (num2 == 0) {
            return ("Делить на 0 нельзя");
        }
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);

    }

}
