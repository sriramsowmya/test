package com.neoteric.learning.ticket;

public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(54,21115,"male","zuv");
        Ticket ticket1= new Ticket(52,5432,"female","uhb");
        Ticket ticket2=new Ticket(60,54332,"cxdss");
        Ticket ticket3=new Ticket(98,7432211);
        Ticket ticket4= new Ticket(76);
        System.out.println(ticket);
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);
        System.out.println(ticket4);


    }
}
