package com.neoteric.learning.generics;

public class Main {
    public static void main(String[] args) {
        GenericClass genericClass=new GenericClass();
        GenericClass polymorphic=new GenericSubClass();
        GenericSubClass genericSubClass=new GenericSubClass();
         genericClass.display("Hello from generic class");//calling the method
         polymorphic.display(123);
         genericSubClass.display(45.76);

    }
}
