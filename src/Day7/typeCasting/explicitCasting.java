package Day7.typeCasting;

public class explicitCasting {
    public static void main(String[] args) {
        // Example 1: double → int
        double d = 10.75;
        int i = (int) d;
        System.out.println("double to int: " + i);

        // Example 2: int → byte (overflow)
        int a = 130;
        byte b = (byte) a;
        System.out.println("int to byte: " + b);

        // Example 3: long → int
        long l = 5000;
        int x = (int) l;
        System.out.println("long to int: " + x);

        // Example 4: float → int
        float f = 9.9f;
        int y = (int) f;
        System.out.println("float to int: " + y);

        // Example 5: char → byte
        char ch = 'A';
        byte ascii = (byte) ch;
        System.out.println("char to byte: " + ascii);
    }
}

