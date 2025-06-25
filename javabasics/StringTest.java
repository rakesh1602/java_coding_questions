package javabasics;

public class StringTest {

    static boolean stringOperatorTest(){
        String s1 = new String("rakesh");
        String s2 = new String("rakesh");

        if (s1 == s2){
            System.out.println("s1==s2");
            return true;
        }
        return false;
    }

    static boolean stringOperatorTestEqual(){
        String s1 = new String("rakesh");
        String s2 = new String("rakesh");

        if (s1.equals(s2)){
            System.out.println("s1 equal s2");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean operatorTest = stringOperatorTest();
        boolean stringOperatorTestEqual = stringOperatorTestEqual();

        System.out.println("operatorTest = " + operatorTest);
        System.out.println("stringOperatorTestEqual = " + stringOperatorTestEqual);
    }
}
