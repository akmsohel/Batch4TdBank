package com.javaWork;

public class Mix1 extends Mix {


    public int mixMethod(){
        for (int i=0;i<5;i++) {

            if (getA() != 20) {
                getA();
            } else {
                setA(21);
            }
            if (getB() == 30) {

                setB(33);
            }
        }
      return getA();

    }
    public void mixMethod1(){

        for(int i=2; i<=6; i++) {
            if(getA()!=getB()) {

                setA(11);
            }else if(getA()==getB()){

                setA(12);

            }else{
                setA(888);
            }

        }

    }

}
