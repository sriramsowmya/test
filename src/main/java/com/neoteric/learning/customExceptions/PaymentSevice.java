package com.neoteric.learning.customExceptions;

public class PaymentSevice {
    static   int seats =10;


    public String payment(int numberOfTickets ) throws InsufficentBlanceException{
        try {

            if (numberOfTickets > 5) {
                throw new InsufficentBlanceException(TransferEnum.INSUFFICIENT_BALANCE.getCode(), TransferEnum.INSUFFICIENT_BALANCE.getLabel());
            }
        }catch (InsufficentBlanceException e){
            System.out.println(" Exception InsufficientBalanceException occurred "+e);
            throw  e;
        }catch (Exception e){
            System.out.println(" Exception occurred "+e);
            throw  e;
        }
        return  "SUCCESS";
    }
}
