package Day3;

public class intExample {
    public static void main(String[] args) {

        // int is a primitive data type in Java
        // It is used to store whole numbers
        // Memory size: 4 bytes = 32 bits
        // Range: -2,147,483,648 to 2,147,483,647
        // Default value (for instance variables): 0
        //Preferred over byte and short in real applications
        //int takes 32 bits of memory,which allows it to store much larger numbers than byte and short.


        int age = 25;           // valid
        int salary = 50000;     // valid
        int population = 1000000; // valid

        // int cannot store decimal values
        // int x = 12.5;        //  Error

        // int cannot store values beyond its range
        // int y = 3000000000; //  Error (out of range)

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
    }
}
