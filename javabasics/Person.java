package javabasics;

public interface Person {
    void getPersonName(String name);

    void getPersonAge(int a);

    private void doSomething() // abstract by default
    {
        System.out.println("Calling private interface method");
    }

    default void sayHello() {
        doSomething();
        System.out.println("Hello from default method!");
    }

    static void log() {
        System.out.println("Static log method");
    }

}
