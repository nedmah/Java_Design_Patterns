package com.kurs2_1sem.OOAIP.zadanie4AdapterFasad.Fasad;

public class TheaterLights {
    int Dim;

    public void dim(int diming) {
        Dim = diming;
        System.out.println("Theater Ceiling Lights dimming to "+diming+" 10%");
    }
    public void on(){
        System.out.println("Theater Ceiling Lights now is On");
        Dim = 100;
    }
    public void off(){
        System.out.println("Theater Ceiling Lights now is Off");
        Dim = 0;
    }
}
