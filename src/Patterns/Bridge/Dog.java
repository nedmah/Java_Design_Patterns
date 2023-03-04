package com.kurs2_1sem.OOAIP.zadanie1Strategy.MostyPattern;

public class Dog extends Animal{

    public Dog(Color color) {
        super(color);
    }

    @Override
    public void makeSound() {
        System.out.println("gav gav mf");
    }
}
