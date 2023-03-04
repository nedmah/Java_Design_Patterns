package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git1;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        init(inventory);

        Guitar whatErinLikes = new Guitar ("", 0, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        Guitar searchGuitar = inventory.search(whatErinLikes);
        if(searchGuitar != null){
            System.out.println("Erin, you might like this " +
                    searchGuitar.getBuilder()+" "+searchGuitar.getModel()+" "+
                    searchGuitar.getType()+" guitar:\n"+
                    searchGuitar.getBackWood()+" back and sides, \n"+
                    searchGuitar.getTopWood()+" top.\nYou can have it for only $"+
                    searchGuitar.getPrice()+"!");

        }else{
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void init(Inventory inventory){
        inventory.addGuitar("1",12,Builder.COLLINGS,
                "Strat",Type.ELECTRIC,Wood.ALDER,Wood.ADIRONDACK);
        inventory.addGuitar("2",32,Builder.COLLINGS,
                "Str4at",Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD,Wood.CEDAR);
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        ; inventory. addGuitar ("V9512",
                1549.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

    }
}
