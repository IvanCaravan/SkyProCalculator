package pro.sky.javacourse2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String answerHello() {
            return "Добро пожаловать в калькулятор";
    }
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
