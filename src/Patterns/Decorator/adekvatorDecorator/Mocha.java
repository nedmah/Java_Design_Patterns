package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }



    public double cost() {
        return 0.20 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
