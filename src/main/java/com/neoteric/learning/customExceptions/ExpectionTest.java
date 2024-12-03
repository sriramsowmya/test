package com.neoteric.learning.customExceptions;

public class ExpectionTest {
    public void calcualteWithfinally(int numberofTicket) throws Exception {
        String status = null;
        try {
            System.out.println(" Available "+PaymentSevice.seats);

            PaymentSevice.seats =  PaymentSevice.seats-numberofTicket;

            System.out.println(" Available "+PaymentSevice.seats);

            PaymentSevice  paymentService = new PaymentSevice();
            status =  paymentService.payment(numberofTicket);

        }finally {
            if (!"SUCCESS".equals(status)){
                PaymentSevice.seats =  PaymentSevice.seats+numberofTicket;
            }
            System.out.println(" from finally calcualteWithfinally 333");
            System.out.println(" post payment Available "+PaymentSevice.seats);
        }

        System.out.println(" post finally  block");
    }
}
