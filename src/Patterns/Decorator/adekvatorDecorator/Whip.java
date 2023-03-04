package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }



    public double cost() {
        return 0.10 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
