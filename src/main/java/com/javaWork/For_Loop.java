package com.javaWork;

public class For_Loop {
    int a=15;
    int b=14;
    public void method(){
        for(int i=0; i<6;i++){
            // i=0, true a, 0+1/  i=1, true a, 1+1/  i=2, true a,2+1/  i=3, true a,3+1/  i=4, true a,4+1/  i=5, true a,5+1/  i=6, false/ ... 6 times
            if(a==14){
               a+=a;

            } else{
                a-=a;
            }

        }
    }
    public void method1(){
        for(int i=6; i>=0;i--){
            // i=6, true a, 6-1/  i=5, true a, 5-1/  i=4, true a,4-1/  i=3, true a,3-1/  i=2, true a,2-1/  i=1, true a,1-1/  i=0, true , 0-1 / -1, false /... 7 times
            if(a==14 && a!=b || a<b){
                b+=b;

            } else{
                b-=b;
            }

        }
    }

}
