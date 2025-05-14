class Parent {
    public static void display() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    public static void display() {
        System.out.println("Child's static method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();  // Parent's static method

        Child child = new Child();
        child.display();  // Child's static method

        Parent ref = new Child();
        ref.display();  // Parent's static method (method hiding, not polymorphism)
    }
}
