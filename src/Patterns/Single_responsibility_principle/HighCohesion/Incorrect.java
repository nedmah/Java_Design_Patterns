package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.HighCohesion;

public class Incorrect {
    private int temperature;
    private int time;

    public Incorrect() {
    }

    public Incorrect(int temperature, int time) {
        this.temperature = temperature;
        this.time = time;
    }

    private int calculateTimeDifference(int time) {
        return this.time - time;
    }

    private int calculateTemperatureDifference(int temperature) {
        return this.temperature - temperature;
    }
}
