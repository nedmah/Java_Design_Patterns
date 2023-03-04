package com.kurs2_1sem.OOAIP.zadanie1Strategy.adekvatUTKI;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
