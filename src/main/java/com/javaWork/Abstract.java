package com.javaWork;

public abstract class Abstract implements Animal {

    int a=20;


    abstract int spead();    //abstract method

    abstract int price();

    public int door(){      //non-abstract method

        return 4;
    }
    public int wheel(){

        return 4;
    }
    public static class Static{

        int v=4;
        public int met(){

            return 0;
        }
    }
}
