package com.kurs2_1sem.OOAIP.zadanie6Fabric.Abstractnaya;

public class Test {
    public static void main(String[] args) {
        FurnitureFactory factory = null;
        String config = "Modern";
        if(config == "Modern"){
            factory = new ModernFactory();
        }else if(config == "Victorian"){
            factory = new VictorianFactory();
        }
        Application app = new Application(factory);
    }
}
