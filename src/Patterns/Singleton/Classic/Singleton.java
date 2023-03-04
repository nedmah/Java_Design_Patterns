package com.kurs2_1sem.OOAIP.zadanie5Singleton.Classic;

public class Singleton {
    private static Singleton uniqueInstance;
    // other useful instance variables here
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
// Other methods
}
//через clone и понять enum