package Day10;

public class mathUtilityDemo {

    public static void main(String[] args) {

        // Math.abs() → Returns the absolute (positive) value
        System.out.println("abs(-10): " + Math.abs(-10));
        // Output: 10


        // Math.max() → Returns the maximum of two numbers
        System.out.println("max(5, 9): " + Math.max(5, 9));
        // Output: 9


        // Math.min() → Returns the minimum of two numbers
        System.out.println("min(5, 9): " + Math.min(5, 9));
        // Output: 5


        // Math.sqrt() → Returns square root (always returns double)
        System.out.println("sqrt(16): " + Math.sqrt(16));
        // Output: 4.0


        // Math.pow() → Returns power of a number (base, exponent)
        System.out.println("pow(2, 3): " + Math.pow(2, 3));
        // Output: 8.0


        // Math.cbrt() → Returns cube root
        System.out.println("cbrt(27): " + Math.cbrt(27));
        // Output: 3.0


        // Math.round() → Rounds to nearest whole number
        System.out.println("round(4.6): " + Math.round(4.6));
        // Output: 5


        // Math.floor() → Rounds down to nearest integer value
        System.out.println("floor(4.9): " + Math.floor(4.9));
        // Output: 4.0


        // Math.ceil() → Rounds up to nearest integer value
        System.out.println("ceil(4.1): " + Math.ceil(4.1));
        // Output: 5.0


        // Math.random() → Generates random double between 0.0 and 1.0
        System.out.println("random(): " + Math.random());
        // Output: value like 0.23456


        // Generate random integer between 1 and 10
        int randomInt = (int) (Math.random() * 10) + 1;
        System.out.println("Random Integer (1-10): " + randomInt);
    }
}

