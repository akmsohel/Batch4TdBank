package com.javaWork;

public abstract class One  implements Fish {
    int a=9;
    int b=10;
    int c=11;




    Constructor con=new Constructor();
    Constructor con1=new Constructor(2);
    Constructor con2=new Constructor(2,6);

    int aa=con.a;

    abstract int m1(); //abstract method

    abstract int m2();  //abstract method

    int m3(){         //non-abstract method
    a=90;
    c=22;
    int co=con.fly(2);

        return a;
    }
    int m4(int a){    //non-abstract method

    con.swim();
    con.work();

    con1.fly(6);

    return aa;
    }
    }


