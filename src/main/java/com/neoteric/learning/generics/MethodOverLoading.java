package com.neoteric.learning.generics;

public class MethodOverLoading {
    public <T> void output(T value){
        System.out.println("Number");
    }
    public <T,U> void output (T value1,U value2) {
        System.out.println("Hello,Hiii");
    }
    public <T,U,V>void output(T value3,U value4, V value5){
        System.out.println("Welcome");
    }
}
