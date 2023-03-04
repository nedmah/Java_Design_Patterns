package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.n2.Validator;

public class CustomerServiceValidator implements IProductValidator{
    @Override
    public boolean IsValid(Product product) {
        return product.Price > 100000;
    }
}
