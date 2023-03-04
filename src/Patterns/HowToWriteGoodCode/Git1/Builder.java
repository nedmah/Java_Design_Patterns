package com.kurs2_1sem.OOAIP.zadanie9Gitara.Git1;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
    public String toString(){
        switch (this){
            case FENDER:
                return "fender";
            case MARTIN:
                return "martin";
            case GIBSON:
                return "gibson";
            case COLLINGS:
                return "collins";
            case ANY:
                return "any";
            case PRS:
                return "prs";
            case RYAN:
                return "ryan";
            case OLSON:
                return "olson";
        }
        return null;
    }
}
