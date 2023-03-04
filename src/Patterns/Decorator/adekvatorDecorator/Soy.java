package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }



    public double cost() {
        return 0.15 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
