package com.kurs2_1sem.OOAIP.zadanie5Singleton.StaticInitialize;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
