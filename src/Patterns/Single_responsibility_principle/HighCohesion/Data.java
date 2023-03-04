package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.HighCohesion;

public class Data {
    private TemperatureData temperatureData;
    private TimeData timeData;

    public Data() {
    }

    public Data(TemperatureData temperatureData, TimeData timeData) {
        this.temperatureData = temperatureData;
        this.timeData = timeData;
    }

    public Data(int time, int temperature) {
        this.temperatureData = new TemperatureData(temperature);
        this.timeData = new TimeData(time);
    }

    // тут логика по работе как со временем, так и с температурой
}
