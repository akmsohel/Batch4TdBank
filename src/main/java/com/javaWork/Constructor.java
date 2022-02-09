package com.javaWork;

public class Constructor extends Overriding {
   Calculation c=new Calculation(2);
    Constructor(){

        int a=20;
    }
    Constructor(int a){
         this.a=a;
         super.a=a;
         super.fly();
    }
    Constructor(int a,int b){
        method();
        method7();
        swim();

    }
    int fly(int a){
       int a1= c.a4;
       c.method3();

        return 2;
    }
    int fly(int a,int b){
        int a1= c.a4;

        return a;
    }
    public static Calculation method(){


        return new Calculation(2);
    }

}
