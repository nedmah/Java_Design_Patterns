package com.kurs2_1sem.OOAIP.zadanie1Strategy.adekvatUTKI;

public class MallardDuck extends Duck{


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }

    @Override
    public void Fly() {

    }

    @Override
    public void Quack() {

    }

}
