package javabasics;

public class Child extends Parent {
    int a = 5;
    int b = 5;
    public void getParentMethodAndVariables(){
        int i = super.a + super.b; //20
        System.out.println("from super parent class addition is = " + i);
        add(15,15); //30
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.getParentMethodAndVariables();

        ThirdChild thirdChild = new ThirdChild();
        thirdChild.multiply(thirdChild.a, thirdChild.b);
    }
}
