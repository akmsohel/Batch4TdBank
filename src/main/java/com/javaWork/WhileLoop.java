package com.javaWork;

public class WhileLoop {
    public int a=10;
    int b=5;

    public void m(){
        while (a>5){      // 10>5, 9>5,8>5, 7>5, 6>5   5 times
            if(a!=b) {
                int c = a + 1;//11
                a--;//10 9 8 7 6
            }else {
                a=a-1; //
            }
        }
    }

    public void m1(int a){
        do{                //1 time
           this.a=a+2;
        b++;
        }while(b<10);       //   6<10, 7<10, 8<10, 9<10    4 times

    }
    public int m2() {

        while (a > b) {
            b++;
        }
        return a;

    }
    public int m3(int c){
        do{
            c=a+b;
          a++;
        }while(a>=b);

        return b;
    }
    }


