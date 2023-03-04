package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder,String model,
                          Type type, Wood backWood, Wood topWood){
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
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
    public Guitar search(Guitar searchGuitar){
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar) i.next();

            if(searchGuitar.getBuilder() != guitar.getBuilder())
                continue;

            String model = searchGuitar.getModel().toLowerCase();
            if((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel().toLowerCase () )))
                continue;


            if(searchGuitar.getType() != guitar.getType()) continue;


            if(searchGuitar.getBackWood () != guitar.getBackWood ()) continue;

            if(searchGuitar.getTopWood() != guitar.getTopWood()) continue;

            return guitar;

        }
        return null;
    }
    }
