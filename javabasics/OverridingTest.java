package javabasics;

public class OverridingTest extends Overloading {

    public int add(int a, int b){
        return a + b;
    }

    public String add(String z, String d){
        return z + d;
    }

    public static void main(String[] args) {
        OverridingTest overridingTest = new OverridingTest();
        overridingTest.add(1,2);
        overridingTest.add("a","b");
    }
}
