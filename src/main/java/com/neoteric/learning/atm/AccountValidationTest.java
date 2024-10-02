package com.neoteric.learning.atm;

public class AccountValidationTest {
    public static void main(String[] args) {
        AccountService as = new AccountService();



        User saiUser=new User();
        saiUser.name="sai";
        saiUser.adharNo="4432221";
        saiUser.mobileNo="544321";
        saiUser.pan="44332155321";

        Account saiAccount=as.createAccount(saiUser);
        System.out.println("Sai Account number"+saiAccount.accountNo+"name"+saiAccount.user.pan);

        User geethikaUser=new User();
        geethikaUser.name="sai";
        geethikaUser.adharNo="4432221";
        geethikaUser.mobileNo="544321";
        geethikaUser.pan="44332155321";

        Account geethikaAccount=as.createAccount(geethikaUser);
        System.out.println("Geethika Account number"+geethikaAccount.accountNo+"name"+geethikaAccount.user.name);

       DebitCard debt= as.createDebitCard(saiAccount);
        System.out.println("Sai Debit Card"+debt.atmNumber);
    }
}



