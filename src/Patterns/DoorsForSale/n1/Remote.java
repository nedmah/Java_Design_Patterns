package com.kurs2_1sem.OOAIP.zadanie12Chapter234.n1;

public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressing the button..");
        if(door.isOpen()){
            door.close();
        }else {
            door.open();
        }
    }
}
