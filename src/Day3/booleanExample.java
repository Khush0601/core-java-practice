package Day3;

public class booleanExample {
    public static void main(String[] args) {

        // boolean is a primitive data type in Java
        // It is used to store only two values: true or false
        // Memory size: logical 1 bit
        // Default value (for instance variables): false

        // boolean is commonly used in conditions and decision making
        boolean isJavaFun = true;      // valid
        boolean isLoggedIn = false;    // valid

        // boolean cannot store numbers or characters
        // boolean x = 1;     // ❌ Error
        // boolean y = 'A';   // ❌ Error
        // boolean z = "true"; // ❌ Error

        // boolean values are not written in quotes
        // Only true or false keywords are allowed

        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is User Logged In? " + isLoggedIn);
    }
}
