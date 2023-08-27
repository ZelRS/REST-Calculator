package pro.sky.testing_calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.testing_calculator.exceptions.NullArgumentInDividerException;
import pro.sky.testing_calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public CalculatorServiceImpl() {
    }

    @Override
    public String sayHallo() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int getDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new NullArgumentInDividerException("Нельзя делить на ноль!");
        }
        return num1 / num2;
    }
}
