package com.javaWork;

public class Mix {

    private int a=20;
    private int b=30;

    public int getA(){

        a=22;

        return a;
    }
    public void setA(int a){
        this.a=a;
    }
    int getB(){
        b=31;
        return b;
    }
    void setB(int b){
        this.b=b;
        b=32;
    }
}
