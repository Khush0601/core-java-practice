package Day9;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        boolean b = sc.nextBoolean();

        sc.nextLine();

        String name = sc.nextLine();

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(name);

        sc.close();
    }
}


