package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.HighCohesion;

public class TemperatureData {
    private int temperature;

    public TemperatureData() {
    }

    public TemperatureData(int temperature) {
        this.temperature = temperature;
    }

    private int calculateTemperatureDifference(int temperature) {
        return this.temperature - temperature;
    }
}