package Day9.Method;

import java.util.Scanner;
//Method using Scanner (user input inside method)
public class methodType5 {

    static void readAndPrint() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
    }

    public static void main(String[] args) {
        readAndPrint();
    }
}

