package com.kurs2_1sem.OOAIP.zadanie12Chapter234.n5;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("   BarkRecognizer: Heard a '" +
                bark + "'");
        door.open();
    }
}
