package Day9.Method;
// methods with parameter, no return
public class methodType2 {
    // - PARAMETERS (a, b) → input values passed to the method
    // - NO RETURN VALUE (void means it does not return anything)
    static void add(int a, int b) {
        // a and b are parameters (local variables for this method)
        System.out.println("Sum = " + (a + b));
    }
    public static void main(String[] args) {
        // Calling the method with arguments 10 and 20
        add(10, 20);
    }
}

