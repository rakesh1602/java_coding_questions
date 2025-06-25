package javabasics;

public class InterfaceExamples extends AbstractionTest implements Person {

    @Override
    public void getPersonName(String name) {
        System.out.println("Get Person name : " + name);
    }

    @Override
    public void getPersonAge(int a) {

    }

    public void doSomethingNew() {
        System.out.println("doing something");
    }

    @Override
    public void sayHello() {
        Person.super.sayHello();
    }



    public static void main(String[] args) {
        InterfaceExamples interfaceExamples = new InterfaceExamples();
        interfaceExamples.getPersonName("Rakesh chavan");
        interfaceExamples.getPersonAge(25);
        interfaceExamples.getPersonNameFromAbstraction("rakesh chavan abstraction");
        interfaceExamples.getPersonAge(60);
        interfaceExamples.getAge(25);
        interfaceExamples.sayHello();
        Person.log();

    }

    @Override
    void getPersonNameFromAbstraction(String name) {

    }
}


