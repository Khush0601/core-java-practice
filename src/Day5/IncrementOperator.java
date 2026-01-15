package Day5;

public class IncrementOperator {
    public static void main(String[] args) {
        //preIncrement
        int a = 5;
        int result = ++a; // first a becomes 6, then assigned to result
        System.out.println("Value of a: " + a);
        System.out.println("Value of result: " + result);

        //postIncrement
        int b=6;
        int response=b++;
        System.out.println("Value of b: " + b);
        System.out.println("Value of a: " + response);

    }
}

