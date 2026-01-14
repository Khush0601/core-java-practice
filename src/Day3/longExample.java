package Day3;

public class longExample {
    public static void main(String[] args) {
        // long is a primitive data type in Java
        // It is used to store very large whole numbers
        // Memory size: 8 bytes = 64 bits
        // Range: -9,223,372,036,854,775,808
        //        to  9,223,372,036,854,775,807
        // Default value (for instance variables): 0
        // long can store values larger than int
        // int max value is 2,147,483,647
        // long x = 2147483648;   //  Error without 'L'
        // long y = 2147483648L;  // ✔ Correct
        // long does not store decimal values
        // long z = 12.5;         //  Error
        long population = 1400000000L;     // L is used to denote long literal
        long distance = 9876543210L;       // valid large value
        long salary = 500000L;             // valid
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        System.out.println("Salary: " + salary);
    }
}
