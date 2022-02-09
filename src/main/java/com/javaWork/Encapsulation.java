package com.javaWork;

public class Encapsulation {

    private int price=40;
    private long rete=5;
    private double interest =7.0;

    public int getPrice(){

        //price=49;

        return price;
    }
    public void setPrice(int price) {

        this.price=price;

        price=55;
    }
    public long getRete(){


        return rete;
    }
    public void setRete(long rate){

    }
    public double getInterest(){

        return interest;
    }
    public void setInterest(double interest){

        this.interest=interest;
        interest=8;
    }

    }

