package com.kurs2_1sem.OOAIP.zadanie1Strategy.MostyPattern;

public class Cat extends Animal{

    public Cat(Color color) {
        super(color);
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow mf");
        color.coloring();
    }
}
