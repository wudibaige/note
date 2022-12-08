package org.example.sheji;

import java.io.Serializable;

public class Singleton1 implements Serializable {
    private Singleton1(){
        if (SINGLETON_1!=null){
            throw new RuntimeException("单例对象不能为空");
        }
        System.out.println("private Singleton1");
    }
    private static final Singleton1 SINGLETON_1=new Singleton1();
    public static Singleton1 getSingleton1(){
        return SINGLETON_1;
    }
    public static void otherMethod(){
        System.out.println("otherMethod");
    }
    public Object readResolve(){
        return SINGLETON_1;
    }
}
