package Day9.Method;

//Method calling another method
public class methodType7 {

    static void message() {
        System.out.println("Inside message method");
    }

    static void show() {
        message();
    }

    public static void main(String[] args) {
        show();
    }
}

