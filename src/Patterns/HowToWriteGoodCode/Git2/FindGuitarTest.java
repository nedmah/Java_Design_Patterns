package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git2;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        init(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List searchGuitar = inventory.search(whatErinLikes);
        if(!searchGuitar.isEmpty()){
            for(Iterator i = searchGuitar.iterator(); i.hasNext();){
                Guitar guitar = (Guitar) i.next();
                System.out.println(" We have a " +
                        guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + " guitar:\n " +
                        guitar.getBackWood() + " back and sides,\n " + guitar.getTopWood() +
                        " top.\n You can have it for only $"+
                        guitar.getPrice() + "!\n ---- ") ;
            }

        }else{
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void init(Inventory inventory){
        inventory.addGuitar("1",12, Builder.COLLINGS,
                "Strat", Type.ELECTRIC, Wood.ALDER, Wood.ADIRONDACK);
        inventory.addGuitar("2",32, Builder.COLLINGS,
                "Str4at", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.CEDAR);
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        ; inventory. addGuitar ("V9512",
                1549.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

    }
}
