package com.kurs2_1sem.OOAIP.zadanie2Decorator.adekvatorDecorator;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.cost());
    }
}
// доп задание обернуть написанный текст в скобочки разные. Текст - основа, скобочки - добавки
//адаптор и фассад