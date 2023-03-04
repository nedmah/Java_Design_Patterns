package com.kurs2_1sem.OOAIP.zadanie15DIP.wrong;

public class Shelf {
    Book book;
    DVD dvd;

    void addBook(Book book) {
        System.out.println("Adding book");
    }

    void addDVD(DVD dvd) {
        System.out.println("Adding DVD");
    }

    void customizeShelf() {
        System.out.println("customizing");
    }


}
