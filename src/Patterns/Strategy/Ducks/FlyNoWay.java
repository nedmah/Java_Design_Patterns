package com.kurs2_1sem.OOAIP.zadanie1Strategy.adekvatUTKI;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("this type of duck can't fly :(");
    }
}
