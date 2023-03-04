package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, Wood backWood, Wood topWood, int numStrings){
        GuitarSpec guitar = new GuitarSpec( builder, model, type, backWood, topWood, numStrings);
        Guitar guitar1 = new Guitar(serialNumber,price,guitar);
        guitars.add(guitar1);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar){
        List list = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getGuitarSpec().matches(searchGuitar)) {
                list.add(guitar);
            }
        }
        return list;
    }
}
