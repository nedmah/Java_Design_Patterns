package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git1;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
    COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString(){
        switch (this){
            case ALDER:
                return "alder";
            case CEDAR:
                return "cedar";
            case MAPLE:
                return "maple";
            case SITKA:
                return "sitka";
            case COCOBOLO:
                return "cocobolo";
            case MAHOGANY:
                return "mahogany";
            case ADIRONDACK:
                return "adirondack";
            case INDIAN_ROSEWOOD:
                return "indian rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "brazilian rosewood";
        }
        return null;
    }
}
