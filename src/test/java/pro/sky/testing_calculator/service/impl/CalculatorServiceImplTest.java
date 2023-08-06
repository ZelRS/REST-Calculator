package pro.sky.testing_calculator.service.impl;

import org.junit.jupiter.api.Test;
import pro.sky.testing_calculator.exceptions.NullArgumentInDividerException;
import pro.sky.testing_calculator.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.testing_calculator.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();
    private int resultExpected;
    private int resultActual;

    @Test
    public void ShouldReturnCurrentSum1() {
        resultExpected = RANDOM_NUM1 + RANDOM_NUM2;
        resultActual = out.getSum(RANDOM_NUM1, RANDOM_NUM2);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldReturnCurrentSum2() {
        resultExpected = RANDOM_NUM3 + RANDOM_NUM4;
        resultActual = out.getSum(RANDOM_NUM3, RANDOM_NUM4);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldReturnCurrentMinus1() {
        resultExpected = RANDOM_NUM1 - RANDOM_NUM2;
        resultActual = out.getMinus(RANDOM_NUM1, RANDOM_NUM2);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldReturnCurrentMinus2() {
        resultExpected = RANDOM_NUM3 - RANDOM_NUM4;
        resultActual = out.getMinus(RANDOM_NUM3, RANDOM_NUM4);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldReturnCurrentMultiply1() {
        resultExpected = RANDOM_NUM1 * RANDOM_NUM2;
        resultActual = out.getMultiply(RANDOM_NUM1, RANDOM_NUM2);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldReturnCurrentMultiply2() {
        resultExpected = RANDOM_NUM3 * RANDOM_NUM4;
        resultActual = out.getMultiply(RANDOM_NUM3, RANDOM_NUM4);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldReturnCurrentDivide1() {
        resultExpected = RANDOM_NUM1 / RANDOM_NUM2;
        resultActual = out.getDivide(RANDOM_NUM1, RANDOM_NUM2);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldReturnCurrentDivide2() {
        resultExpected = RANDOM_NUM3 / RANDOM_NUM4;
        resultActual = out.getDivide(RANDOM_NUM3, RANDOM_NUM4);
        assertEquals(resultExpected, resultActual);
    }

    @Test
    public void ShouldThrowNullArgumentExceptionWhenNum2IsNull() {
        assertThrows(NullArgumentInDividerException.class, () -> out.getDivide(RANDOM_NUM1, NULL_NUMBER));
    }
}
