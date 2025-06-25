package javabasics;

public abstract class AbstractionTest {

   private void getPersonAgeFromAbstraction(int age){
        System.out.println("age = " + age);
    }

    public void getAge(int age){
       getPersonAgeFromAbstraction(age);
    }

    abstract void getPersonNameFromAbstraction(String name);
}
