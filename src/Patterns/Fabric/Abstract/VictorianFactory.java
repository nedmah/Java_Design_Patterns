package com.kurs2_1sem.OOAIP.zadanie6Fabric.Abstractnaya;

public class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
