package com.neoteric.learning.generics;

public class GenericSubClass extends GenericClass {
    @Override
    public <T> void display(T item) {
        System.out.println("GenericSubClass:"+item);

    }
}
