package Day5;

public class DecrementOperator {
    public static void main(String[] args) {
        // Pre-decrement
        int a = 10;
        int preResult = --a;
        System.out.println("a = " + a);
        System.out.println("preResult = " + preResult);

        // Post-decrement
        int b = 10;
        int postResult = b--;
        System.out.println("b = " + b);
        System.out.println("postResult = " + postResult);
    }
}
