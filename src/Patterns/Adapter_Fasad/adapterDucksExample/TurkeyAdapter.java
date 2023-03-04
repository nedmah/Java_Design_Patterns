package com.kurs2_1sem.OOAIP.zadanie4AdapterFasad.adapterUtki;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void Quack() {
        turkey.gobble();
    }

    @Override
    public void Fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
