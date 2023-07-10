package pro.sky.javacourse2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String answerHello() {
            return "Добро пожаловать в калькулятор";
    }
    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
