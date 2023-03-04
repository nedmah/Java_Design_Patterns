package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "house blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
