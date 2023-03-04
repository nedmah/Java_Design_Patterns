package com.kurs2_1sem.OOAIP.zadanie1Strategy.MostyPattern;

public abstract class Animal {

    protected Color color;

    public Animal(Color color){
        this.color = color;
    }

    public abstract void makeSound();
}
