package com.javaWork;


public class Overriding implements Animal, Fish {
        Calculation c=new Calculation(4);
        int a=99;
        @Override
        public long fly() {
            int a= method7().a;
            this.a=a;

            return 0;
        }

        @Override
        public int walk() {
            return 0;
        }
        @Override
        public int work() {
            return 0;
        }
        @Override
        public int swim() {
            return 0;
        }
        @Override
        public int tail() {
            return 0;
        }
        public Calculation method7(){
            c.method3();
            int a= c.a4;
            return c;
        }
    }


