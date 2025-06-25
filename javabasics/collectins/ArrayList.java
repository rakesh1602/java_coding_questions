package javabasics.collectins;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<String> names  = new java.util.ArrayList<>();
        names.add("rakesh 1");
        names.add("rakesh 3");
        names.add("ramesh 2");

        for (String name : names){
            System.out.println("name = " + name);
        }
    }
}
