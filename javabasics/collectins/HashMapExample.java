package javabasics.collectins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();
        person.put("rakesh", 25);
        person.put("ramesh", 26);
        person.put("rohit", 18);
        person.put("rakesh", 45);
        person.put("rakesh", 24);

        for (Map.Entry<String, Integer> details : person.entrySet()){
            System.out.println("details = " + details);
        }


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("rakesh");
        hashSet.add("rakesh");
        hashSet.add("ramesh");

        for (String s: hashSet){
            System.out.println("s = " + s);
        }

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("rakesh", 25);
        hashtable.put("rakesh", 26);
        hashtable.put("eamesh", 25);

        for(Map.Entry<String, Integer> table :  hashtable.entrySet()){
            System.out.println("table = " + table);
        }
    }
}
