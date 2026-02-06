package Class;

class Animals {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogg extends Animals {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animals {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

//Using Polymorphism
public class runtimePolymorphism {
    public static void main(String[] args) {

        Animals a;

        a = new Dogg();
        a.sound();   // Dog barks

        a = new Cat();
        a.sound();   // Cat meows
    }
}
