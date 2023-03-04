package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "dark roasted coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
