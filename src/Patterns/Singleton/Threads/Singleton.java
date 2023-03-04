package com.kurs2_1sem.OOAIP.zadanie5Singleton.MnogoPotok;

public class Singleton {
    private static Singleton uniqueInstance;
    // Другие переменные экземпляра
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
