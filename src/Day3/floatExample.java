package Day3;

public class floatExample {
    public static void main(String[] args) {
        // float is a primitive data type in Java
        // It is used to store decimal (floating-point) numbers
        // Memory size: 4 bytes = 32 bits
        // Precision: up to 6–7 decimal digits
        // Default value (for instance variables): 0.0f
        // 'f' or 'F' is mandatory while assigning a float value
        // because decimal values are treated as double by default
        // Without 'f' it will cause compile-time error
        // float x = 12.5;   // Error (possible lossy conversion)
        // float can store whole numbers also
        // float is not suitable for high-precision calculations
        // (example: financial calculations)
        float count = 10f;  // valid
        float price = 99.99f;       // valid
        float temperature = 36.5f;  // valid
        float percentage = 85.75f;  // valid
        System.out.println("Price: " + price);
        System.out.println("Temperature: " + temperature);
        System.out.println("Percentage: " + percentage);
        System.out.println("Count: " + count);
    }
}
