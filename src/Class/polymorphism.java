package Class;
// polymorphism :Compile-time Polymorphism
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class polymorphism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));       // calls 2-arg method
        System.out.println(calc.add(5, 10, 15));   // calls 3-arg method
        System.out.println(calc.add(2.5, 3.5));    // calls double method
    }
}
