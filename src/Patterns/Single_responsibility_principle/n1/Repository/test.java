package com.kurs2_1sem.OOAIP.zadanie11SingleResponsibilityPrinciple.n1.Repository;

public class test {
    public static void main(String[] args) {
        // создание пользователя
        Account account = new Account();
        account.Name = "Name";
        var accountRepository = new AccountRepository();
        accountRepository.addAccount(account);

// загрузка пользователя по Id
//        var account = accountRepository.GetById(1);

// загрузка со связной коллекцией
// пример из LLBLGen Pro
//        var account = accountRepository.GetById(1, new IPath[]{new Path<Account>(Account.PrefetchPathRoles)});
    }
}
