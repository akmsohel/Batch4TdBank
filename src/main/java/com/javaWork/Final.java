package com.javaWork;

public final class Final extends Abstract {
    //we can't extends to other class
    int a=9;
    int b=7;
    Calculation c=new Calculation(9);
    Calculation method1(int a){
        c.method2(5,6);

        this.a=a;

        return c;
    }
    @Override
    int spead() {
        Calculation.method1(2,5);
        int a=Calculation.a2;

        return 0;
    }

    @Override
    int price() {
      method1(2).method2(4,6)  ;
        return 0;
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
}
