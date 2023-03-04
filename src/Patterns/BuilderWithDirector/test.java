package com.kurs2_1sem.OOAIP.zadanie14BuilderWithDirector;

public class test {
    public static void main(String[] args) {

        CarBuilder builder = new SportsCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println("Below car delievered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }
}
