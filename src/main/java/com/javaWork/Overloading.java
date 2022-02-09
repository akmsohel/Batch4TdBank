package com.javaWork;



    public final class Overloading {

        Calculation calculation=new Calculation(2);

        public Calculation method5() {

            calculation.method3();
            calculation.method2(2,3);

            int aa=calculation.a;
            int aaa=calculation.a4;

            return calculation;
        }

        public int method5(int a) {

            return 3;

        }
        long method5(int a,int b) {

            Calculation y=new Calculation(3);
            y.method3();
            y.method2(5,7);
            return 4;

        }
    }

