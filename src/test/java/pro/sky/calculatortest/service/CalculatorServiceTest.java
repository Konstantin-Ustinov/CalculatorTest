package pro.sky.calculatortest.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private int a;
    private int b;
    CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        a = 2;
        b = -3;
        calculatorService = new CalculatorService();
    }

    @Test
    void plusTwoNum() {
        int result = a + b;
        assertEquals(result, calculatorService.plusTwoNum(a, b));
    }

    @Test
    void minusTwoNum() {
        int result = a - b;
        assertEquals(result, calculatorService.minusTwoNum(a, b));
    }

    @Test
    void multiplyTwoNum() {
        int result = a * b;
        assertEquals(result, calculatorService.multiplyTwoNum(a, b));
    }

    @Test
    void divideTwoNum() {
        int result = a / b;
        assertEquals(result, calculatorService.divideTwoNum(a, b));
    }

    @Test
    void divideNumByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divideTwoNum(a, 0));
    }
}