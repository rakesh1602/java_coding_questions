package javabasics.collectins;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> names =  new LinkedList<>();
        names.add("rakesh");
        names.add("rakesh");
        names.add("ramesh");
        names.add("suresh");
        names.add("rakesh");
        
        for (String name : names){
            System.out.println("name = " + name);
        }
    }
}
