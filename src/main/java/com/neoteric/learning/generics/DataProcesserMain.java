package com.neoteric.learning.generics;

public class DataProcesserMain {
    public static void main(String[] args) {
        DataProcesser baseProcessor =new DataProcesser();
        baseProcessor.processData(60);
        baseProcessor.processData("Hello Mom");


        DataProcesser stringProcessor=new StringDataProcesser();
        stringProcessor.processData(13);
        stringProcessor.processData("Hello Dad");


        DataProcesser integerProcessor=new IntegerDataClass();
        integerProcessor.processData(20);
        integerProcessor.processData("Hello Saritha");
    }
}
