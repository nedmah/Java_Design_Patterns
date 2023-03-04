package com.kurs2_1sem.OOAIP.zadanie4AdapterFasad.Fasad;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, lights,screen, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}

// фасад метод алгоритма сортировки чем отличается от фасада
//утиная типизация разобрать, код работающий