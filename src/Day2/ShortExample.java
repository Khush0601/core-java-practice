package Day2;

public class ShortExample {
    public static void main(String[] args) {

        // short is a primitive data type in Java
        // It is used to store whole numbers (integers only)
        // Memory size: 2 bytes = 16 bits
        // Meaning: short uses 16 bits of memory to store a value
        // Range: -32768 to 32767
        // short can store larger values than byte
        // Decimal values are not allowed

        short year = 2025;
        short salary = 30000;
        short score = -1500;

        // Values outside the range will cause compile-time error
        // short x = 40000;   //  Error: out of range
        // short y = 12.5;    //  Error: decimal not allowed

        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Score: " + score);
    }
}
