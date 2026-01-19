package Day7.scope;

public class localScope{
    public static void main(String[] args) {
        int x = 10;   // local variable
        System.out.println(x);
        display();
    }
    public static void display() {
        int x=1;
        System.out.println(x); //
    }
}

