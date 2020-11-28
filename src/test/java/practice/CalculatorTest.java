package practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void doSum() {

        int actual = calculator.calculate("+", 2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void doMin() {

        int actual = calculator.calculate("-", 2, 3);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void doMulti() {

        int actual = calculator.calculate("*", 2, 3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void doDiv() {

        int actual = calculator.calculate("+", 2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divExeption() {

        int actual = calculator.calculate("/", 2, 0);
    }
}