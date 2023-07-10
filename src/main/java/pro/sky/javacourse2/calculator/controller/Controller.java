package pro.sky.javacourse2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javacourse2.calculator.service.CalculatorServiceImpl;



@RestController
@RequestMapping("/calculator")
public class Controller {

    private final CalculatorServiceImpl calculatorServiceImpl;
    public Controller(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String hello() {
        return calculatorServiceImpl.answerHello();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        }
        return calculatorServiceImpl.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String subtraction(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        }
        return calculatorServiceImpl.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        }
        return calculatorServiceImpl.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Введите все значения.";
        }
        return calculatorServiceImpl.divide(num1, num2);
    }
}
