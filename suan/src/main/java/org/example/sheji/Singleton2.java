package org.example.sheji;
/*
懒汉式单例
 */

import java.io.Serializable;

public class Singleton2 implements Serializable {
    private Singleton2( ) {
        System.out.println("private Singleton2");
    }

    private static volatile Singleton2 INSTANCE = null;

    public static Singleton2 getInstance( ) {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }

    public static void otherMethod( ) {
        System.out.println("otherMethod");
    }
}
