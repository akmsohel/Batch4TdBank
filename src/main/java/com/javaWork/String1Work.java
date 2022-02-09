package com.javaWork;

import org.testng.annotations.Test;

public class String1Work {
    int num[] = {7, 8, 9, 2, 3, 4, 7, 6, 10, 11, 5};
    int maximum = 0;
    int secondMaximum = 0;
    int smallest = 0;
    int secondSmallest = 0;

    // @Test
    public void numbers() {

        for (int i = 0; i < num.length; i++) {

            if (maximum < num[i]) {

                maximum = num[i];
            }
        }
        System.out.println("Maximum number is " + maximum);
    }

    @Test
    public void minimum() {

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] < smallest) {
                    smallest = num[i];

                }
            }

        }

        System.out.println("The smallest element is: " + smallest + "\n" + "The second smallest element is: " + secondSmallest);
    }

    // @Test
    public void setSecondMaximum() {
        for (int i = 0; i < num.length; i++) {
            if (maximum < num[i]) {
                secondMaximum = maximum;

                maximum = num[i];
            } else if (secondMaximum < num[i])
                maximum = num[i];

        }
        System.out.println("secondMaximum number is :" + secondMaximum);
    }


}