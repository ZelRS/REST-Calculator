package pro.sky.testing_calculator.service.impl;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.testing_calculator.service.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.testing_calculator.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();
    private int resultExpected;
    private int resultActual;

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void ShouldCurrentSum(int num1, int num2) {
        resultExpected = num1 + num2;
        resultActual = out.getSum(num1, num2);
        assertEquals(resultExpected, resultActual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void ShouldCurrentMinus(int num1, int num2) {
        resultExpected = num1 - num2;
        resultActual = out.getMinus(num1, num2);
        assertEquals(resultExpected, resultActual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void ShouldCurrentMultiply(int num1, int num2) {
        resultExpected = num1 * num2;
        resultActual = out.getMultiply(num1, num2);
        assertEquals(resultExpected, resultActual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void ShouldCurrentDivide(int num1, int num2) {
        resultExpected = num1 / num2;
        resultActual = out.getDivide(num1, num2);
        assertEquals(resultExpected, resultActual);
    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(RANDOM_NUM1, RANDOM_NUM2),
                Arguments.of(RANDOM_NUM3, RANDOM_NUM4),
                Arguments.of(RANDOM_NUM1, RANDOM_NUM3),
                Arguments.of(RANDOM_NUM2, RANDOM_NUM4)
        );
    }
}
