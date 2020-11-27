package practice;

public class Calculator {
    public int calc(int firstNum, char symbol, int secondNum) {

        if (symbol == '+') {
            return firstNum + secondNum;
        } else if (symbol == '-') {
            return firstNum - secondNum;
        } else if (symbol == '*') {
            return firstNum * secondNum;
        } else if (symbol == '/') {
            return firstNum / secondNum;
        } else {
            return firstNum % secondNum;
        }
    }
}
