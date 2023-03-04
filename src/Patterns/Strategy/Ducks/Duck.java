package com.kurs2_1sem.OOAIP.zadanie1Strategy.adekvatUTKI;

public abstract class Duck{

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck(){}


    public void performQuack(){
        quackBehavior.Quack();
    }

    public void swim(){
        System.out.println("duck is swimming..");
    }

    abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void Fly();

    public abstract void Quack();
}
