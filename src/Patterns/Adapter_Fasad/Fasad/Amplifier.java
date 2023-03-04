package com.kurs2_1sem.OOAIP.zadanie4AdapterFasad.Fasad;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cdplayer;
    int Volume;
    public void on(){
        System.out.println("Amplifier on");
    }
    public void off(){
        System.out.println("Amplifier off");
    }
    public void eject(){
        System.out.println("Player eject!");
    }

    public void setDvd(DvdPlayer dvdplayer) {
        this.dvd = dvdplayer;
        System.out.println("setting DVD player to Top-O-Line DVD Player");
    }

    public void setVolume(int volume) {
        Volume = volume;
        System.out.println("Amplifier setting volume to "+Volume);
    }
    public void setSurroundSound(){
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }
}
