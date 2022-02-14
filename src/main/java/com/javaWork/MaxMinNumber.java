package com.javaWork;

public class MaxMinNumber {
    public static void main(String[] args) {
        int num[] = {9, 89, 56, 17, 0, 3, 7, 8, 3, 86, 199, 3, 2, 22};
        int minNumber = num[0];
        int maxNumber = num[0];
        int secMinNumber = num[0];
        int secMaxNumber = num[0];
        int sec_max = num[0];
        for (int i = 0; i < num.length; i++) {

            if (maxNumber < num[i]) {
                secMaxNumber = maxNumber;
                maxNumber = num[i];
            } else if (secMaxNumber < num[i]) {
                secMaxNumber = num[i];
            }


            if (minNumber > num[i]) {
                secMinNumber = minNumber;
                minNumber = num[i];
            } else if (secMinNumber > num[i]) {
                secMinNumber = num[i];
            }

        }
        System.out.println(" Minimum " + minNumber);

        System.out.println("second maximum" + secMaxNumber);

        System.out.println("Maximum" + maxNumber);
        System.out.println("Second minimum " + secMinNumber);


    }
}