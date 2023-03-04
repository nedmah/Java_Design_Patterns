package com.kurs2_1sem.OOAIP.zadanie5Singleton.ConditionalBlocking;

public class Singleton {
    private volatile static Singleton uniqueInstance;  // Ключевое слово volatile гарантиру ет, что параллельные программные
    private Singleton() {}                             // потоки будут правильно работать с переменной
    public static Singleton getInstance() {            // uniqueInstance при ее инициализации экземпляром Singleton.
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

