package com.example.java_base.single;

/**
 * @Author: zzq
 * @Description: 饿汉式单例
 * @Date: 2019/7/2 12:00
 * 1、饿汉模式
 * 优点：线程安全的,在类创建的同时就已经创建好一个静态的对象供系统使用,以后不在改变无需关注多线程问题、写法简单明了
 * 缺点：它是加载类时创建实例、所以如果是一个工厂模式、缓存了很多实例、那么就得考虑效率问题，因为这个类一加载则把所有实例不管用不用一块创建
 */
public class Singleton1 {
    // 指向自己实例的私有静态引用，主动创建
    private static Singleton1 singleton1 = new Singleton1();

    // 私有的构造方法
    private Singleton1() {}

    // 以自己实例为返回值的静态的公有方法，静态工厂方法
    public static Singleton1 getSingleton1(){
        return singleton1;
    }

}
