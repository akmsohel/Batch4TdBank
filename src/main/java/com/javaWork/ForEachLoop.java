package com.javaWork;

public class ForEachLoop {


    int k;
    String[] s1;
    String[] s = {"Bird", "cow", "frog"};
    int[] a = {20, 70, 6, 9, 8, 9};
    int[] b = {15, 40, 30, 20, 3};
    int[] n = {1, 3, 5, 9, 7};
    int n1 = 3;
    int n2 = 60;

    public int method() {
        for (int n : a) {
            k = n;
        }
        return k;      //9
    }

    public String[] method1() {
        for (String ss : s) {
            String s1 = ss;

            for (int i = 0; i < 5; i++) {

            }
            if (s[1] == "Bird") {
            } else {
                b[0] = 100;
            }
        }
        return s1;
    }

    void method2() {
        while (a[1] > b[1]) {
            int a = 5;
            a++;

        }
    }

    public void method3() {
        do {

            b[1]++;
        }
        while (a[1] > b[1]);

    }

    public void m1() {
        for (int c : n) {
            for (int i = 2; i < 10; i++) {
                c = n[3];
            }
        }
    }

    public void m2() {
        do {
            a = n;
            n1++;
        } while (n1 < 20);
    }

}




