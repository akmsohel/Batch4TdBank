package com.javaWork;

public class Two  extends One {

    public Two(){

        int aa=super.a;
    }

    int a=44;

    @Override
    int m1() {
        int sp=super.b;
        super.m3();
        super.m4(2);
        a=4;
        this.a=a;
        super.m3();
        super.m4(3);
        m2();
        return 1;
    }

    @Override
    int m2() {
        return 0;
    }
    static int m7(){
        return 3;
     }

    @Override
    public long fly() {
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
}
