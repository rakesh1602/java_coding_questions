package javabasics;

public class ThirdChild extends Child{
    public void multiply(int a, int b){
        int multiply = this.a *  this.b;
        System.out.println("multiply = " + multiply);

        int childMultiply =  super.a * super.b;
        System.out.println("childMultiply = " + childMultiply);
    }
}
