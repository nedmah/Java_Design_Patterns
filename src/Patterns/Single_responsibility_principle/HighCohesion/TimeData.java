package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.HighCohesion;

public class TimeData {

    private int time;

    public TimeData() {
    }

    public TimeData(int time) {
        this.time = time;
    }

    private int calculateTimeDifference(int time) {
        return this.time - time;
    }
}
