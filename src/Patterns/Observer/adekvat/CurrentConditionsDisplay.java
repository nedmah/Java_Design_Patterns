package com.kurs2_1sem.OOAIP.zadanie3Nablyudatel.adekvat;

public class CurrentConditionsDisplay implements DisplayElement,Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        Display();
    }

    @Override
    public void Display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


}
