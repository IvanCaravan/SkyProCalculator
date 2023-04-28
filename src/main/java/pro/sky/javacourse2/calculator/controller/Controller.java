package pro.sky.javacourse2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javacourse2.calculator.CalculatorService;



@RestController
@RequestMapping("/calculator")
public class Controller {

    private final CalculatorService calculatorService;
    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.answerHello();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        }
        return calculatorService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String subtraction(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        }
        return calculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        }
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        } else if (num2.equals(0)) {
            return "Ошибка. Делить на 0 нельзя.";
        }
        return calculatorService.divide(num1, num2);
    }
}
