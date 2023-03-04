package com.kurs2_1sem.OOAIP.zadanie4AdapterFasad.Fasad;

public class Projector {
    DvdPlayer dvdPlayer;
    public void on(){
        System.out.println("Projector is on!");
    }
    public void off(){
        System.out.println("Projector is off!");
    }
    public void wideScreenMode(){
        System.out.println("Projector in widescreen mode (16x9 aspect ratio)");
    }
    public void tvMode(){
        System.out.println("Projector in tv mode (12x8 aspect ratio)");
    }
}
