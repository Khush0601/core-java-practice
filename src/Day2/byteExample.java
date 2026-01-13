package Day2;

public class byteExample {
    public static void main(String[] args) {

        // byte data type stores whole numbers
        // It consumes 1 byte = 8 bits of memory
        // valid (within range -128 to 127)
        // We cannot store numbers greater than 127 in byte
        // Example: byte x = 200;  // Error (out of range)

        byte age = 101;
        byte marks = 34;
        byte id = 127;

        System.out.println(id);
        System.out.println(age);
        System.out.println(marks);
    }
}
