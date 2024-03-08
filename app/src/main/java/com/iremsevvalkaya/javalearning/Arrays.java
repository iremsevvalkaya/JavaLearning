package com.iremsevvalkaya.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){
        String[] myStringArray = new String[3];
        myStringArray[0] = "x";
        myStringArray[1] = "y";
        myStringArray[2] = "z";
        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;

        System.out.println(myIntegerArray[1]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(myNumberArray[2]);

        //Lists
        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("lars");
        myMusicians.add(1, "Kirk" );



        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
             //SET : aynı veriden sadecebir tane tutar
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());

        //HashMap

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "James");
        myHashMap.put("instrument", "guitar");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);
        System.out.println(mySecondMap.get("run"));



    }
}
