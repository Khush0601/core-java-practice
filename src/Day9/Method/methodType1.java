package Day9.Method;

// no input no return
public class methodType1 {

    // This is a method with:
    //  NO parameters (it does not take any input)
    //  NO return value (void means it returns nothing)
    // It is used only to perform an action (printing a message)

    static void greet() {
        // This statement executes when the method is called
        System.out.println("Hello, Java");
    }

    public static void main(String[] args) {
        // Calling the greet() method
        // Control goes to greet(), prints the message,
        greet();
    }
}


