package com.kurs2_1sem.OOAIP.zadanie1Strategy.MostyPattern;

public class Zverushnik {
    public static void main(String[] args) {
        Animal cat1 = new Cat(new BlackColor());
        cat1.makeSound();
    }
}
