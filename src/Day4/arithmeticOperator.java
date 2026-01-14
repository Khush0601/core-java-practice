package Day4;

// Operators are symbols used to perform operations on variables and values.
// Arithmetic Operators perform mathematical calculations.
// Important Points:
// 1. Arithmetic operators work with numeric data types only
// 2. Division with int removes decimal part
// 3. Modulus (%) is used to find remainder
// 4. Use float or double for decimal results
// 5. Division by zero causes runtime error
//    Example: int x = 10 / 0;  // Error
public class arithmeticOperator {
    public static void main(String[] args) {

        int a = 20;
        int b = 3;

        // Addition
        int add = a + b;
        System.out.println("Addition: " + add);

        // Subtraction
        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        // Multiplication (*) → multiplies two values
        int mul = a * b;
        System.out.println("Multiplication: " + mul);

        // Division: if decimal comes as a quotient then it will not consider decimal just give integer part
        // ex:20/3=6
        //    10/4=2
        //    8/3=2

        int div = a / b;
        System.out.println("Division: " + div);

        // Modulus → gives remainder after division
        int mod = a % b;
        System.out.println("Modulus: " + mod); // 0

        float result = (float) a / b;
        System.out.println("float:" + result);

        double doubleResult = (double) a / b;
        System.out.println("doubleRes:" + doubleResult);

        float x = 10.0f;
        float y = 3.0f;
        float floatresult = x / y;
        System.out.println("float Result:" + floatresult);

        double c = 10.0;
        double d = 3.0;
        double doubleresult = x / y;
        System.out.println("doubleresult:" + doubleresult);
    }
}
