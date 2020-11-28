package practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnCorrectResultForAdditionOperation() {

        int actual = calculator.calculate("+", 2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectResultForSubtractionOperation() {

        int actual = calculator.calculate("-", 2, 3);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectResultForMultiplyOperation() {

        int actual = calculator.calculate("*", 2, 3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectResultForDivideOperation() {

        int actual = calculator.calculate("+", 2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionForDivideByZero() {

       calculator.calculate("/", 2, 0);
    }
}