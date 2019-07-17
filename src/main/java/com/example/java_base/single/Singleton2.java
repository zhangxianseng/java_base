package com.example.java_base.single;

/**
 * @Author: zzq
 * @Description: 饿汉模式
 * @Date: 2019/7/2 12:00
 * 1、懒汉模式
 * 优点：用到对象的时候再去创建，避免不必要的内存开支，节约资源
 * 缺点：它是加载类时创建实例、所以如果是一个工厂模式、缓存了很多实例、那么就得考虑效率问题，因为这个类一加载则把所有实例不管用不用一块创建
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2(){};

    public static Singleton2 getSingleton2(){
        // 被动创建，在真正需要使用时才去创建
        if(singleton2 == null)
            singleton2 = new Singleton2();

        return singleton2;
    }
}
