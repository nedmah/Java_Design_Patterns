package com.kurs2_1sem.OOAIP.zadanie3Nablyudatel.adekvat;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
