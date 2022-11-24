package pro.sky.calculatortest.service;


import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorServiceParameterizedTest {

    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void sumTwoNum(int a, int b) {
        int result = a + b;
        Assertions.assertEquals(result, calculatorService.plusTwoNum(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void minusTwoNum(int a, int b) {
        int result = a - b;
        Assertions.assertEquals(result, calculatorService.minusTwoNum(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void multiplyTwoNum(int a, int b) {
        int result = a * b;
        Assertions.assertEquals(result, calculatorService.multiplyTwoNum(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideParamForTests")
    public void divideTwoNum(int a, int b) {
        int result = a / b;
        Assertions.assertEquals(result, calculatorService.divideTwoNum(a, b));
    }

    public static Stream<Arguments> provideParamForTests() {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4, -2),
                Arguments.of(9, 1)
        );
    }
}
