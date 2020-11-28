package practice;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
        int nums = calculator.calculate("/", 5, 0);
            System.out.println(nums);
        }catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
