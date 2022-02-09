package com.javaWork;

public class Three {

    Two tw=new Two();
    One on=new Two();
    One e;
    int b=2;
    final int c=4;
    static int s=9;
    private int p=10;

    One speed(Two a){
        run().m3();
        run().m2();
        int bb=run().b;
        run().m1();
        on.m3();
        on.m4(7);
        return on;
    }

    Two run(){
        tw.m7();
        Two.m7(); //static method

        tw.m1();
        tw.m4(3);
        int a1= tw.a;
        int a2= tw.c;


        return tw;
    }

}
