package com.javaWork;

public class EvenOdd {
    public static void main(String[] args) {
//
//        int num = 100;
//System.out.println("Even numbers are : ");
//
//        for(int i=0;i<=100;i++){
//            if(i%2==0){
//               System.out.print(i+" ");
//            }
//            if(i%2==1){
//                System.out.println("Odd number is :"+i);
//            }
//
  //      }
        int array[]={8,9,6,8,4,98,7,11,17,45,80,76,3,23,36,88};
//        System.out.println("Even numbers are : ");
//
//        for(int i=0;i<array.length;i++){
//            if(array[i]%2==0){
//                System.out.print(array[i]+" ");
//
//            }
//
//        }
        System.out.println("Odd numbers are : ");

        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+" ");

            }

        }


    }
}