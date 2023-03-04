package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.n2.Validator;

public class Product {
    private IProductValidator validator;
    public int Price;



    public Product(IProductValidator validator) {
        this.validator = validator;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
