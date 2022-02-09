package com.javaWork;

    public class Bird {
        int a=56;


        Animal animal= new Frog(); // Interface...class
        Fish fish=new Frog();

        public long fly() {
            int time=10;
            return animal.work();
        }


        public int walk() {
            int a=0;
            return fish.swim();
        }

        long seat(){         //Overloading

            return fly();
        }
        long seat(int a){

            return fly();
        }
        long seat(Fish f, Animal a){

            return fly();
        }
    }

