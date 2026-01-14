package Day3;

public class charExample {
    public static void main(String[] args) {
        // char is a primitive data type in Java
        // It is used to store a single character
        // Memory size: 2 bytes = 16 bits
        // Range: 0 to 65,535 (Unicode characters)
        // Default value (for instance variables): '\u0000'
        // char values are written using single quotes ' '
        // char can also store Unicode values
        // char can store numbers, but as characters, not numeric values
        // char x = 65;   //  Allowed (represents 'A')
        // char y = 'AB'; //  Error (only one character allowed)
        // char does not use double quotes
        // char z = "A";  //  Error

        char grade = 'A';      // valid character
        char digit = 'k';      // valid digit character
        char symbol = '@';     // valid symbol
        char unicodeChar = '\u0041'; // Unicode for 'A'

        System.out.println("Grade: " + grade);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Unicode Char: " + unicodeChar);
    }
}
