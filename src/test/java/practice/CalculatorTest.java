package practice;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void calc() {

        Calculator calculator = new Calculator();
        int actual = calculator.calc(10, '*', 2);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void divisionByZero() {

        Calculator calculator = new Calculator();
        int actual = calculator.calc(10, '/', 0);

        /*int expected = 8;
        assertEquals(expected, actual);*/
    }
}