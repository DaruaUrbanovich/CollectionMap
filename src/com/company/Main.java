package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Student student1 = new Student("Dima", "Molodec");
        Student student2 = new Student("Tanya", "Super");
        Student student3 = new Student("Andrew", "Horosho");

        Map<Integer,Student> map = new HashMap<>();

        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1,"Dominos");
//        map.put(2,"Dodo");
//        map.put(3,"Terra");
//
//
        System.out.println(map);
    }
}