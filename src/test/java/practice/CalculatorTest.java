package practice;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test(expected = ArithmeticException.class)
    public void calc() {

        Calculator calculator = new Calculator();
        int actual = calculator.calc(10, '/', 0);
        int expected = 5;
        assertEquals(expected, actual);
    }
}