package com.kurs2_1sem.OOAIP.zadanie1Strategy.adekvatUTKI;

public class MuteQuack implements QuackBehavior{
    @Override
    public void Quack() {
        System.out.println("this duck can't make any sound :(");
    }
}
