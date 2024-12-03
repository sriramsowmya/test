package com.neoteric.learning.interfacee;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        //scanner is for customisation
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        int s=sc.nextInt();
        MusicPlay musicPlay =new MusicPlay();
        //s is for used to store scanner input values
        musicPlay.music(s);

    }
}
