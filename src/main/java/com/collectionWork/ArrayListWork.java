package com.collectionWork;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListWork {

        String []s={"Bird", "cow","frog"};

        int [] a={20,70,6,9,8,7};

        ArrayList c=new ArrayList();
        ArrayList<Integer> number=new ArrayList<Integer>();
        Set lhs=new LinkedHashSet();
        Set hs=new HashSet();

        public void m() {
            c.add("pen");
            c.add("Book");
            c.add("Pencil");
            c.add(true);
            c.remove(s[0]);
            c.add(s[1]);
            c.add(s[2]);
            for (int i = 0; i < c.size(); i++) {  //pen,Book, Pencil,true,cow ,frog     ( get array)

                c.get(i);
            }
            for (Object o : c) {        ///pen,Book, Pencil,true,cow ,frog
                Object oo = o;
            }

            Iterator<Object> it = c.iterator();    ///pen,Book, Pencil,true,cow ,frog
            while (it.hasNext()) {

                Object iter = it.next();
            }

            c.stream().forEach(el -> {             //lambda expression
                Object ele = el;
            });                                 //pen,Book, Pencil,true,cow ,frog

            c.get(2);
            c.size();


            number.add(10); //int only
            number.add(20);
            number.add(30);
            for (int sNumber : number) {
                int sN = sNumber;
            }

            ArrayList list = new ArrayList(Arrays.asList(7, 8, 3, 66, 3, 5));

        }
        void m1(){
            Collection c = new ArrayList();
            c.add("dfkldjf");
            c.add("dfdsf");

            ArrayList aList = new ArrayList();
            aList.add(10);
            aList.add("age");
            aList.add("price");
            aList.addAll(c);

            aList.add(1,s);

            // aList.clear();
            ArrayList<String> clone=(ArrayList<String>)aList.clone();


            aList.contains(10); // true/false
            if(aList.contains(10)==false){
                aList.add(10);
            }
            else {
                aList.add(12);
            }
            aList.indexOf("age");
            int k=aList.lastIndexOf("price");
            aList.remove(1);

            ArrayList<Integer> llist=new ArrayList<Integer>(Arrays.asList(20,6,5,9,34,7)) ;
            llist.removeIf(ist -> ist%2==0);     //5,9,7

        }
        void syncronizeArrayList() {

            CopyOnWriteArrayList<String> nameList = new CopyOnWriteArrayList<String>();

            nameList.add("pet");
            nameList.add("doll");
            nameList.add("cow");
            System.out.println(nameList);
            Iterator<String> iit = nameList.iterator();
            while (iit.hasNext()) {

                System.out.println(iit.next());

                // sorting & compare with two arrays
                ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(201, 6, 55, 9, 34, 7));
                ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(20, 6, 5, 9, 34, 8));

                Collections.sort(lst);
                Collections.sort(list);
                lst.equals(list);       // false

                //   lst.removeAll(list); //  remove 2nd arrayList from 1st arrayList
            }
        } }