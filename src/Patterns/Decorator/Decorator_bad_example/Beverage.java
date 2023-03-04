package com.kurs2_1sem.OOAIP.zadanie2Decorator.bidloDecorator;

public class Beverage {
    protected String description;
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;
    protected double MilkCost = 0.2;
    protected double SoyCost = 0.14;
    protected double MochaCost = 0.16;
    protected double WhipCost = 0.21;


    public String getDescription() {
        return description;
    }

    public double cost() {
        double persCost = 0;
        if (hasMilk()) {
            persCost = persCost + MilkCost;
        }
        if (hasMocha()){
            persCost = persCost+MochaCost;
        }
        if(hasSoy()){
            persCost = persCost + SoyCost;
        }
        if(hasWhip()){
            persCost = persCost + WhipCost;
        }
        return persCost;
    }


    public boolean hasMilk(){return milk;}

    public boolean hasMocha() {return mocha;}

    public boolean hasSoy() {return soy;}

    public boolean hasWhip() {return whip;}

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
