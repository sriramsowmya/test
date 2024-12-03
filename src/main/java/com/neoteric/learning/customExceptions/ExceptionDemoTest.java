package com.neoteric.learning.customExceptions;

public class ExceptionDemoTest {
    public static void main(String[] args) {

            System.out.println("Hello World");
            try {
                ExpectionTest test = new ExpectionTest();
                test.calcualteWithfinally(2);

                System.out.println(" Ticket booking is done");
            }catch (Exception e){
                System.out.println(((InsufficentBlanceException)e).getCode()+"  "+e.getMessage());
            }

            System.out.println(" I am done calculation");


        }
    }

