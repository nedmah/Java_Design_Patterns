package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public abstract class Beverage {
    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
