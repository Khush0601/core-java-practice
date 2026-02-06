package Class;
// class  and from that object creation :
class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}


public class main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Amit";
        s1.age = 20;
        s1.study();

        Student s2 = new Student();
        s2.name = "Neha";
        s2.age = 22;
        s2.study();
    }
}

