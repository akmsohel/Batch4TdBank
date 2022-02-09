package com.javaWork;

import java.util.Iterator;
import java.util.Locale;

public class StringWork {
    public static void main(String[] args) {
        String s = "Akm";

        String s1 = "Mok";
        String s2 = "Say";
        String s3 = s.concat(" ").concat(s1).concat(" ").concat(s2);
        //System.out.println(s3);
        // System.out.println(s3.hashCode());
        String reverse = "";

        int length = s3.length();
        // System.out.println(s3.toUpperCase(Locale.ROOT));
        //   System.out.println(s3.replace(" ",""));
        //  System.out.println(s3.length());
        //System.out.println("I am trim method: "+s3.trim());

        char s6[] = s3.toCharArray();
//        for(int i=s6.length-1;i>=0;i--){
//            reverse=reverse+s6[i];
//        }
        // System.out.println(reverse);

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s3.charAt(i);
        }
        System.out.println(reverse);
        //    StringBuffer sb=new StringBuffer(s3);
        //  System.out.println(sb.reverse());


        int a[] = {41, 6, 8, 3, 49, 2, 5, 7, 45};
        int max =a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max =a[i];
            }
        }
        System.out.println(max);

        int min=0;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);

        int total=0;
        for (int i = 0; i < a.length; i++) {

                total = total+a[i];

        }
        System.out.println(total);


        int secMax=0;
        int maximum=0;

        for (int i = 0; i < a.length; i++) {
            if (maximum < a[i]) {
               secMax= maximum ;
               maximum=a[i];
            }else if(secMax<a[i]){
                secMax=a[i];
            }
        }
        System.out.println(secMax);

    }

}
