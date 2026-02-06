package Day9.Method;
// method with return
public class methodType3 {
    // - PARAMETERS (a, b) → input values passed to the method
    // - RETURN VALUE (int) → the method sends a value back to the caller
    static int multiply(int a, int b) {
        return a * b; // value is returned to the calling method
    }

    public static void main(String[] args) {
        // Calling multiply() method
        // The returned value is stored in 'result'
        int result = multiply(5, 4);
        System.out.println(result);
    }
}

