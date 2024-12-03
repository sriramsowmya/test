package com.neoteric.learning.hashmaptest;
import java.util.*;
import java.util.HashMap;

public class  MapTest {
    public static void main(String[] args) {
       Map<String,Integer> map=new HashMap<>();
        //inserting data into map
        map.put("maths",50);
        map.put("social",65);
        map.put("hindi",70);
        map.put("english",80);

        //Retrieve data from map

        map.entrySet();
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        Iterator<Map.Entry<String,Integer>>itr= entrySet.iterator();

       while (itr.hasNext()){
         Map.Entry<String,Integer>entryMap=itr.next();
           System.out.println(entryMap.getKey()+"value"+entryMap.getValue());

       }

       map.entrySet().stream().forEach( entry ->{
           System.out.println(entry.getKey()+"value"+entry.getValue());


           
       });
        Map<String, Integer> SortedMap = new TreeMap<>();
        SortedMap.put("Maths", 65);
        SortedMap.put("Hindhi", 75);
        SortedMap.put("Telugu", 89);
        SortedMap.put("English",69);

        SortedMap.entrySet().stream().forEach(entry ->{
            System.out.println(entry.getKey()+" value"+entry.getValue());
        });

    }
}

