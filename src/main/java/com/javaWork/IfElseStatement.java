package com.javaWork;

public class IfElseStatement extends Encapsulation {
    int a = 99;
    int b = 88;

    public int statements() {
        for (int i = 0; i < 5; i++) { // 1 ,2,4,3  | 2,4,3| 2,4,3| 2,4,3| 2,4,3|   5 times
            // 0, true, 44, 1/  1, true ,44,2/  2, true ,44 ,3/  3, true ,44 ,4/  4, true ,44 ,5/
            if (getPrice() == 40) {   //false

                setPrice(44);
            } else {
                setPrice(45);

            }
        }
        return getPrice();
    }

    public int statements1() {
        for (int i = 1; i <= 5; i++) {      // 5 times
            if (getPrice() == 40 || a == 99) {

                a = a - 1;

            } else {
                a = a + 1;
            }
        }
        return a = a - 1;
    }

    public void statements2() {
        for (int i = 6; i > 1; i--) {       // 5 times

            //6, true , b, 5/ 5, true , b, 4/ 4, true , b, 3/ 3, true , b, 2/ 2, true , b, 1/

            if (20 < 21 || 40 < 50 || 6 >= 2) {
                b = b + 2;

            } else {
                b = b - 2;
            }
        }
    }

    public void statements3() {

        for (int i = 5; i >= 1; i++) {
            if (a != b && a >= 99 && b <= 88) {
                int c = a + b;

            } else {
                int c = a + b + 1;
            }
        }
    }
    }