package com.kurs2_1sem.OOAIP.zadanie4AdapterFasad.Fasad;

public class DvdPlayer {
    Amplifier amplifier;
    public void on(){
        System.out.println("DVD Player on");
    }
    public void off(){
        System.out.println("DVD Player off");
    }
    public void play(String str){
        System.out.println("Playing the film: "+str);
    }
    public void stop(){
        System.out.println("Dvd stopped!");
    }
    public void eject(){
        System.out.println("Disk ejected!");
    }
}
