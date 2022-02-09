package com.javaWork;

import java.util.*;

public class CollectionClass  {
    String []s={"Bird", "cow","frog"};

    int [] a={20,70,6,9,8,7};

    ArrayList c=new ArrayList();
    ArrayList<Integer> number=new ArrayList<Integer>();

    Set lhs=new LinkedHashSet();
    Set hs=new HashSet();

    public void m(){
        c.add("pen");
         c.add("Book");
         c.add("Pencil");
         c.add(true);
         c.remove(s[0]);
         c.add(s[1]);
         c.add(s[2]);
         for(int i=0;i<c.size();i++){  //pen,Book, Pencil,true,cow ,frog     ( get array)

             c.get(i);
         }
        for (Object o :c) {        ///pen,Book, Pencil,true,cow ,frog
            Object oo=o;
        }

        Iterator<Object> it=c.iterator();    ///pen,Book, Pencil,true,cow ,frog
        while (it.hasNext()) {

            Object iter = it.next();
        }

        c.stream().forEach(el-> {             //lambda expression
            Object ele=el;
        });                                 //pen,Book, Pencil,true,cow ,frog

        c.get(2);
        c.size();


        number.add(10); //int only
             number.add(20);
             number.add(30);
        for(int sNumber : number) {
            int sN=sNumber;
         }

        ArrayList list=new ArrayList(Arrays.asList(7,8,3,66,3,5));

      }


}
