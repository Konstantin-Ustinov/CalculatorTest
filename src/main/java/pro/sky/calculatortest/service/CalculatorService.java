package pro.sky.calculatortest.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plusTwoNum(int num1, int num2) {
        return num1 + num2;
    }

    public int minusTwoNum(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyTwoNum(int num1, int num2) {
        return num1 * num2;
    }

    public int divideTwoNum(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }

    }

}
