package com.kurs2_1sem.OOAIP.zadanie12Chapter234.n6Randy;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("   BarkRecognizer: Heard a '" +
                bark + "'");
        if (door.getAllowedBark().equals(bark)) {
            door.open();
        } else {
            System.out.println("This dog is not allowed.");
        }
    }
}
