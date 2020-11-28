package practice;

import java.util.HashMap;
import java.util.Map;

class Calculator {

    enum Operation {
        ADD {
            int calculate(int a, int b) {
                return a + b;
            }
        },
        MIN {
            int calculate(int a, int b) {
                return a - b;
            }
        },
        MUL {
            int calculate(int a, int b) {
                return a * b;
            }
        },
        DIV {
            int calculate(int a, int b) {
                return a / b;
            }
        };

        abstract int calculate(int a, int b);
    }

    Map<String, Operation> operations = new HashMap<>();

    Calculator() {
        operations.put("+", Operation.ADD);
        operations.put("-", Operation.MIN);
        operations.put("*", Operation.MUL);
        operations.put("/", Operation.DIV);
    }

    public int calculate(String operation, int a, int b) {
        return operations.get(operation).calculate(a, b);
    }
}

