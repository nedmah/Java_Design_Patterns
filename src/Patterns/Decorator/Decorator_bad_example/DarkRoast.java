package com.kurs2_1sem.OOAIP.zadanie2Decorator.bidloDecorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Most excellent Dark Roast";
    }

    @Override
    public double cost() {
        double DarkroastCost = 3;
        if (hasMilk()) {
            DarkroastCost = DarkroastCost + MilkCost;
        }
        if (hasMocha()){
            DarkroastCost = DarkroastCost+MochaCost;
        }
        if(hasSoy()){
            DarkroastCost = DarkroastCost + SoyCost;
        }
        if(hasWhip()){
            DarkroastCost = DarkroastCost + WhipCost;
        }
        return DarkroastCost;
    }

//    Косяки :
//    может поменяться стоимость
//    новые дополнения
//    для некоторых напитков дополнения лишние

}
