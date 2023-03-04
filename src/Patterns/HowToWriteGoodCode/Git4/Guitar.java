package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git4;

public class Guitar {
    public String serialNumber;
    public double price;

    public GuitarSpec guitarSpec;


    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec){
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }
}
