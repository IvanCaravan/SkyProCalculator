package pro.sky.javacourse2.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {


    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    public void answerHelloTest() {
        String result = calculatorService.answerHello();
        assertEquals("Добро пожаловать в калькулятор", result);
    }

    @Test
    void plusTest() {
        String result = calculatorService.plus(3, 1);
        assertEquals("3 + 1 = 4", result);
        String result2 = calculatorService.plus(3, 2);
        assertEquals("3 + 2 = 5", result2);
    }

    @Test
    void minusTest() {
        String result = calculatorService.minus(4, 1);
        assertEquals("4 - 1 = 3", result);
        String result2 = calculatorService.minus(4, 2);
        assertEquals("4 - 2 = 2", result2);
    }

    @Test
    void multiplyTest() {
        String result = calculatorService.multiply(2, 2);
        assertEquals("2 * 2 = 4", result);
        String result2 = calculatorService.multiply(2, 3);
        assertEquals("2 * 3 = 6", result2);
    }

    @Test
    void divideTest() {
        String result = calculatorService.divide(4, 4);
        assertEquals("4 / 4 = 1", result);
        String result2 = calculatorService.divide(8, 4);
        assertEquals("8 / 4 = 2", result2);
    }

    @Test
    void divideWithExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(4, 0));
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(6, 0));
    }
}