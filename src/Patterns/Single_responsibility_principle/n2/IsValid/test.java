package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.n2.IsValid;

public class test {
    public static void main(String[] args) {
        var product = new Product();
        product.Price = 100;
        var isValid = product.IsValid();
    }
}
