package com.neoteric.learning.ticket;

public class Ticket {
    public double amount;
    public String  gender;
    public String busPass;
    public int adhar;


    @Override
    public String toString() {
        return "Ticket{" +
                "amount=" + amount +
                ", gender='" + gender + '\'' +
                ", busPass='" + busPass + '\'' +
                ", adhar='" + adhar + '\'' +
                '}';
    }

    public Ticket(double amount, int adhar, String gender, String busPass) {
        this.amount = amount;
        this.gender=gender;
        this.busPass = busPass;
        this.adhar = adhar;
    }

    public Ticket(double amount, int adhar, String busPass) {
        this.amount = amount;
        this.busPass = busPass;
        this.adhar = adhar;
    }

    public Ticket(double amount, int adhar) {
        this.amount = amount;
        this.adhar = adhar;
    }

    public Ticket(double amount) {
        this.amount = amount;

    }
}
