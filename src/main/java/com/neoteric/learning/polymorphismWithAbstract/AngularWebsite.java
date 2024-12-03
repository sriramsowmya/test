package com.neoteric.learning.polymorphismWithAbstract;

public abstract class AngularWebsite implements Website {
    @Override
    public void   header() {

        System.out.println("from header");

    }

    @Override
    public void fotter() {
        System.out.println("from fotter");

    }

    @Override
    public void body() {
        System.out.println("from body");

    }

    public String page(){
        header();
        body();
        fotter();
        return this.getClass().getName();
    }
}
