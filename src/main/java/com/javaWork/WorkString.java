package com.javaWork;


import org.apache.commons.lang3.ObjectUtils;

public class WorkString {

    public static void main(String[] args) {
        String s = "I am a great";
        String s1 = " employee";
        int[] num = {41, 78, 9, 6,2, 3, 90, 60,4, 88,55};
        int max = num[0];
        int min = num[0];
        int secMax=num[0];
        int seMini=num[0];

        for (int i = 0; i < num.length; i++) {

            if (max < num[i]) {
                secMax=max;
                max = num[i];
            }
            else if(secMax<num[i]){
                secMax=num[i];

            }
            if (min > num[i]) {
                secMax=min;
                min = num[i];
            }
           else if (seMini > num[i]) {
                seMini = num[i];
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
        System.out.println("second Maximum number is : "+secMax);
        System.out.println("second Minimum number is : "+seMini);





//       System.out.println( s.concat(s1).trim());
//        System.out.println( s.trim());
//        System.out.println( s.toUpperCase(Locale.ROOT));

//        char[] c = s.toCharArray();
//        StringBuffer reverse = new StringBuffer();
//        for (int i = c.length - 1; i >= 0; i--) {
//            reverse.append(c[i]);
//        }
//        System.out.println(reverse);
//        System.out.println(reverse.toString().replace(" ", ""));
//
//        String word[] = s.split(" ");
//        StringBuffer reverseWord = new StringBuffer();
//        for (int i = word.length - 1; i >= 0; i--) {
//            reverseWord.append(word[i]).append(" ");
//        }
//        System.out.println(reverseWord);
            //  System.out.println(reverse.substring(1,3));
            // System.out.println(s.substring(1,3));


        }
    }
