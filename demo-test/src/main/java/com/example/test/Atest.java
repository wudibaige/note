package com.example.test;

import java.util.Random;

public class Atest {
    Random random=new Random();

    public static Atest a1(String name){
        System.out.println(name);
        return a2(name);
    }
    public static Atest a2(String name){
        System.out.println(name);
        return a1(name);
    }
}
