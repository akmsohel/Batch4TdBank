package com.collectionWork;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableWork {

    public static void main(String[] args) {
        met();

        Map map = new Hashtable();

        // Hash table does not take any null Key or value
        //It doesn't take duplicate key also
        // HashTable is not Synchronized


        map.put("Id", "1");
        map.put("ads", "2");

        map.put("name", "ak");
        map.put("phone", "34789898");
        map.put("firstName", "Abu");
        map.put("Age", "30");
        // map.put("lastName", null);
        map.put("Phone", "76765757");
        //  map.put(null, "3");

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            Object value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println("*******************");

        //usingt entry set
        Iterator<Map.Entry<String, String>> entry = map.entrySet().iterator();
        while (entry.hasNext()) {

            Map.Entry<String, String> entry1 = entry.next();

            entry1.getValue();

            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }
        System.out.println("*******************");

        // Iterator for hashMap  java 8 using each & lambda
        map.forEach((k, v) -> System.out.println("Key : " + "+ value= " + k + " " + v));

        System.out.println("*******************");

        map.put("Age", "300");
        //  map.put("lastName", null);
        map.put("Phone", "976765757");
        //map.put(null, "31");



        try {
            map.put("Age", "300");
            map.put("lastName", null);
            map.put("Phone", "976765757");
            map.put(null, "31");
            System.out.println(map.keySet());


        } catch (NullPointerException e) {

            System.out.println(" null Pointer Exception");

        } finally {
            System.out.println(" It has null Pointer Exception");
        }

    }
    public static void met() throws NullPointerException {

        Map map = new Hashtable();
        map.put("name", "ak");
        map.put("phone", "34789898");
        map.put("firstName", "Abu");
        map.put("Age", "30");
        // map.put("lastName", null);
        map.put("Phone", "76765757");
        //map.put(null, "3");

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            Object value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
