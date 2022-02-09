package com.collectionWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapWork {

    public static void main(String[] args) {
        int max = 0;
      //  int minimum;
        int s[] = {62, 4, 6, 904, 65, 910};

//           Iterator it= Arrays.stream(s).iterator();        // s.stream.iterator
//           while (it.hasNext()) {
//               System.out.println(it.next());
//           }

        for (int i = 0; i < s.length; i++) {
            int s2= s[i];

            System.out.println(s2);
        }

//            
//           for(int i=0;i<s.length;i++){
//               while (max<s[i]){
//                   max=s[i];
//               }
//           }
//            System.out.println(max);

        for (int i = 0; i < s.length; i++) {
               int s2= s[i];

        System.out.println(s2);
        }



        //it takes key & value pear
        // it does not follow indexing
        //key can not duplicate
        // it takes 1 null key & multiple null value
        // hashMap is not synchronized / not thread safe
        // duplicate keys are not allows
//            Map<String, String> hm = new HashMap<String, String>();
//            hm.put("firstName", "Abu");
//            hm.put("Age", "30");
//            hm.put("lastName", "Mosa");
//            hm.put("Phone", "76765757");
//            hm.get("firstName");         // Abu
//            hm.put(null, "jhgjkh@gmail.com");
//            hm.put("email", null);
//            hm.put("adds", "fchvjhgkljhjl");
//            hm.remove(null);               // using remove method
//
//            Iterator<String> it = hm.keySet().iterator();    // using get(key)
//            while (it.hasNext()) {
//                String key = it.next();
//
//                String value = hm.get(key);
//                System.out.println("Key is :"+key + "  Value is:  " + value);
//
//            }
//            System.out.println("*******************");
//            //usingt entry set
//            Iterator<Map.Entry<String, String>> entry = hm.entrySet().iterator();
//            while (entry.hasNext()) {
//                Map.Entry<String, String> entry1 = entry.next();
//                System.out.println(entry1.getKey() + entry1.getValue());
//            }
//            System.out.println("*******************");
//            // Iterator for hashMap  java 8 using each & lambda
//            hm.forEach((k, v) -> System.out.println("Key : " + k + " value :" + v));
//
//
//            HashMap<Integer, String> map = new HashMap<Integer, String>();
//            map.put(1,"an");
//            map.put(2,"na");
//            map.put(3,"nn");
//            HashMap<Integer, String> map1 = new HashMap<Integer, String>();
//            map1.put(1,"an");
//            map1.put(3,"nn");
//            map1.put(2,"na");
//
//            map.equals(map1); // true
//            HashMap<Integer, String> map2 = new HashMap<Integer, String>();
//            map2.put(1,"an");
//            map2.put(3,"nn");
//            map2.put(2,"na");
//            map2.put(2,"na");
//            map.equals(map2); // false
//
//            map.keySet().equals(map1); // true
//            map.keySet().equals(map1); // true   (but it should not be true)


    }

}
