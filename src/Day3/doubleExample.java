package Day3;


    public class doubleExample {
        public static void main(String[] args) {
            // double is a primitive data type in Java
            // It is used to store decimal (floating-point) numbers
            // Memory size: 8 bytes = 64 bits
            // Precision: up to 15–16 decimal digits
            // Default value (for instance variables): 0.0
            // Decimal values are treated as double by default in Java
            // No suffix is required while assigning a double value
            // double is more precise than float
            // Preferred for calculations requiring accuracy
            // double is not ideal for exact financial calculations
            // (BigDecimal is preferred instead)
            double salary = 45000.75;        // valid
            double pi = 3.141592653589793;   // high precision
            double distance = 123456.78901;  // valid

            // double can store whole numbers as well
            double count = 100;  // valid

            System.out.println("Salary: " + salary);
            System.out.println("PI Value: " + pi);
            System.out.println("Distance: " + distance);
            System.out.println("Count: " + count);
        }
    }



