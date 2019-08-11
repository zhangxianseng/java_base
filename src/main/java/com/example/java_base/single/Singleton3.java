package com.example.java_base.single;

/**
 * @author zzq 2019/8/10 12:30
 * @description
 */
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3(){}
    public static Singleton3 getSingleton3(){
        if(singleton3 == null){
            synchronized (Singleton3.class){
                if(singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }

        }
        return singleton3;
    }
}
