package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.n1.ActiveRecord;

public class test {
    public static void main(String[] args) {
        Account account = new Account();
        account.addNew();
        account.name = "Name";
        account.save();
        account.loadByPrimaryKey(1);
      //  var list = account.Roles;
    }

    /*
    В данном случае объект Account имеет несколько ответственностей:
    является объектом домена и хранит бизнес-правила, например, связь с коллекцией ролей
    является точкой доступа к базе данных
     */
}
