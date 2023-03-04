package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class Decaf extends Beverage{

    public Decaf() {
        description = "coffee without caffeine";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
