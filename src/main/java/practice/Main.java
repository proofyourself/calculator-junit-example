package practice;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int numbers = calculator.calc(4, '/', 0);
            System.out.println("answer = " + numbers);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
