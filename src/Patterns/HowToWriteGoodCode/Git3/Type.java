package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git3;

public enum Type {
    ACOUSTIC, ELECTRIC;

    public String toString(){
        switch (this){
            case ACOUSTIC:
                return "acoustic";
            case ELECTRIC:
                return "electric";
        }
        return null;
    }
}
