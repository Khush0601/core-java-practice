package Day7.scope;

public class blockScope {
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {
            int b = 20;
            System.out.println(b);
        }
        display();
    }

    public static void display() {

        int a = 10;
        if (a > 5) {
            int b = 20;
            System.out.println(b);
        }
        blockForLoop();
    }

    public static void blockForLoop() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }


    }
}


