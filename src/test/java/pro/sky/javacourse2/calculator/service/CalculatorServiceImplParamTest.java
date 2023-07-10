package pro.sky.javacourse2.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @ParameterizedTest
    @CsvSource({"4,3,7", "5,1,6", "8,2,10"})
    void plus(int num1, int num2, int expected) {
        String result = calculatorService.plus(num1, num2);
        assertEquals(num1 + " + " + num2 + " = " + expected, result);
    }

    @ParameterizedTest
    @CsvSource({"4,3,1", "5,1,4", "8,2,6"})
    void minus(int num1, int num2, int expected) {
        String result = calculatorService.minus(num1, num2);
        assertEquals(num1 + " - " + num2 + " = " + expected, result);
    }

    @ParameterizedTest
    @CsvSource({"4,3,12", "5,1,5", "8,2,16"})
    void multiply(int num1, int num2, int expected) {
        String result = calculatorService.multiply(num1, num2);
        assertEquals(num1 + " * " + num2 + " = " + expected, result);
    }

    @ParameterizedTest
    @CsvSource({"4,4,1", "5,1,5", "8,2,4"})
    void divide(int num1, int num2, int expected) {
        String result = calculatorService.divide(num1, num2);
        assertEquals(num1 + " / " + num2 + " = " + expected, result);
    }
}