package com.neoteric.learning.atm;

import java.util.Date;
import java.util.UUID;

public class AccountService {
    public Account createAccount(User user ){
    Account a =new Account();
    a.accountNo= UUID.randomUUID().toString();
    a.user=user;

    return a;


    }

    public DebitCard createDebitCard(Account account){
        DebitCard debt =new DebitCard();
        debt.atmNumber=String.valueOf(Math.random());
        debt.name="sai";
        debt.fromDate=new Date();
        debt.toDate=new Date();
        debt.cvv="563673";

        return debt;

    }

    }


