package com.neoteric.learning.generics;

public class IntegerDataClass extends DataProcesser {

    @Override
    public <E> void processData(E element) {
        System.out.println("StringDataProcessor:hey guys");
        if (element instanceof Integer) {
            System.out.println("Processed Integer Data:" + ((Integer) element) * 8);
        }else {
            //default behaviour for non-integer data
            super.processData(element);


        }
    }
}
