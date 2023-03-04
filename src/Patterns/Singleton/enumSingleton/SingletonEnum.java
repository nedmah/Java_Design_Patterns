package com.kurs2_1sem.OOAIP.zadanie5Singleton.enumSingleton;

public enum SingletonEnum {
    INSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
