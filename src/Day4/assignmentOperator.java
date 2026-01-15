package Day4;

// Assignment operators are used to assign and update values in a variable
// They make the code shorter and easier to read

public class assignmentOperator {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("Initial value of a: " + a);

        // Add and assign (+=)
        a += 5;   // a = a + 5
        System.out.println("After a += 5 : " + a);

        // Subtract and assign (-=)
        a -= 3;   // a = a - 3
        System.out.println("After a -= 3 : " + a);

        // Multiply and assign (*=)
        a *= 2;   // a = a * 2
        System.out.println("After a *= 2 : " + a);

        // Divide and assign (/=)
        a /= 4;   // a = a / 4
        System.out.println("After a /= 4 : " + a);

        // Modulus and assign (%=)
        a %= 3;   // a = a % 3
        System.out.println("After a %= 3 : " + a);
    }
}
