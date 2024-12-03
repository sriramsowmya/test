package com.neoteric.learning.interfacee;

public class MusicPlay implements MusicPlayer {


    @Override
    public void music(int j) {
     if (j==1){
         System.out.println("Play");
     }else if (j==2){
         System.out.println("pause");
     }else if(j==3){
         System.out.println("Stop");
     }else {
         System.out.println("Unknow input");
     }
    }
}
