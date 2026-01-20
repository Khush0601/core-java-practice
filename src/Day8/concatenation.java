package Day8;

public class concatenation {
    public static void main(String[] args) {

        // Using + Operator
        String s1 = "Hello";
        String s2 = "World";
        String plusConcat = s1 + " " + s2;
        System.out.println("Using + operator: " + plusConcat);

        // Using String.concat() Method
        String concatMethod = s1.concat(" ").concat(s2);
        System.out.println("Using concat(): " + concatMethod);

        // Using String.join() Method
        String joinMethod = String.join(" ", s1, s2);
        System.out.println("Using String.join(): " + joinMethod);
    }
}

