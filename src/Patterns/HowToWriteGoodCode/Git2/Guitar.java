package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git2;

public class Guitar {
    private String serialNumber, model;
    private Builder builder;
    private Type type;
    private double price;
    private Wood backWood, topWood;


    public Guitar(String serialNumber, double price, Builder builder, String model,
                  Type type, Wood backWood, Wood topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

}
