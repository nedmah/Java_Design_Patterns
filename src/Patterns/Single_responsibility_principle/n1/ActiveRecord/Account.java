package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.n1.ActiveRecord;

import java.util.ArrayList;

public class Account {
    public int id;
    public String name;
    ArrayList accounts = new ArrayList();

    public Account(int id, String name, ArrayList accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    public Account() {
    }

    public void addNew(){
        Account account = new Account();
        accounts.add(account);
    }

    public void save(){
        System.out.println("Saving...");
    }

    public void loadByPrimaryKey(int id){
        System.out.println("loading by key?");
    }


}




//Есть достаточно устойчивое мнение, что объединять бизнес логику с логикой хранения в одном классе — это очень плохой, негодный паттерн.