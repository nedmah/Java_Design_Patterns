package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.n2.IsValid;

public class Product {

    public int Price;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public boolean IsValid()
    {
        return Price > 0;
    }
}
   /* Теперь наш объект Product начал использовать в некоем CustomerService,
        который считает валидным продукт с ценой больше 100 тыс. рублей.
        Что делать? Уже сейчас понятно, что нам придется изменять наш объект продукта
    */