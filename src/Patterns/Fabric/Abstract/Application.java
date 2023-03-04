package com.kurs2_1sem.OOAIP.zadanie6Fabric.Abstractnaya;

public class Application {
    private Chair chair;
    private Table table;
    private Sofa sofa;

    public Application(FurnitureFactory factory) {
        table = factory.createTable();
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public void sitOn(){
        table.sitOn();
        chair.sitOn();
        sofa.sitOn();
    }
}
