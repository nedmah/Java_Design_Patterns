package com.kurs2_1sem.OOAIP.zadanie4AdapterFasad.adapterUtki;

public class MallardDuck implements Duck{
    @Override
    public void Quack() {
        System.out.println("quack");
    }

    @Override
    public void Fly() {
        System.out.println("I'm flying");
    }
}
