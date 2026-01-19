package Day7.typeCasting;

public class implicitCasting {
    public static void main(String[] args) {
        // Example 1: byte → int
        byte b = 10;
        int i = b;
        System.out.println("byte to int: " + i);

        // Example 2: short → int
        short s = 50;
        int j = s;
        System.out.println("short to int: " + j);

        // Example 3: int → long
        int x = 100;
        long l = x;
        System.out.println("int to long: " + l);

        // Example 4: int → double
        int a = 20;
        double d = a;
        System.out.println("int to double: " + d);

        // Example 5: long → float
        long m = 1000L;
        float f = m;
        System.out.println("long to float: " + f);

        // Example 6: char → int
        char ch = 'A';
        int ascii = ch;
        System.out.println("char to int (ASCII): " + ascii);

        // Example 7: expression implicit casting
        int p = 10;
        double q = 5.5;
        double result = p + q; // int → double automatically
        System.out.println("int + double: " + result);
    }
}

