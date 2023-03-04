package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
