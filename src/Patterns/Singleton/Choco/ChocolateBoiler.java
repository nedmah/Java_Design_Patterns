package com.kurs2_1sem.OOAIP.zadanie5Singleton.Choco;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;



    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
