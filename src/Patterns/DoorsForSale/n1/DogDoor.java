package com.kurs2_1sem.OOAIP.zadanie12Chapter234.n1;

public class DogDoor {
    private boolean open;



    public DogDoor() {
        this.open = false;
    }

    public void open(){
        System.out.println("Door opens");
        open = true;
    }

    public void close(){
        System.out.println("Door closes");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
