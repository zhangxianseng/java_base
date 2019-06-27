package com.example.java_base.single;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zzq
 * @Description: 单例模式
 * @Date: 2019/5/29 11:00
 */
public class SingleDemo {

    private String name;

    private SingleDemo(){ }

    /**
     * 1、饿汉模式
     * 优点：线程安全的,在类创建的同时就已经创建好一个静态的对象供系统使用,以后不在改变无需关注多线程问题、写法简单明了
     * 缺点：它是加载类时创建实例、所以如果是一个工厂模式、缓存了很多实例、那么就得考虑效率问题，因为这个类一加载则把所有实例不管用不用一块创建
     */
    private static SingleDemo singleHungery = new SingleDemo();

    public static SingleDemo getHungeryInstence(){
        return singleHungery;
    }

    /**
     * 1、懒汉模式
     * 优点：用到对象的时候再去创建，避免不必要的内存开支，节约资源
     * 缺点：它是加载类时创建实例、所以如果是一个工厂模式、缓存了很多实例、那么就得考虑效率问题，因为这个类一加载则把所有实例不管用不用一块创建
     */
    private static SingleDemo singleLazy;

    public static synchronized SingleDemo getLazyInstence(){
        if(singleLazy == null){
            singleLazy = new SingleDemo();
        }
        return singleLazy;
    }

    /**
     * 静态内部类实现懒汉模式
     */
    private  class SingleHolder{
        private  SingleDemo singleHolder = new SingleDemo();
        public void func(){
            System.out.println(name);
        }
    }


    public static void main(String [] args){

        String TranDate = new SimpleDateFormat("YYYYMMdd").format(new Date());
        System.out.println(TranDate);
        String TranTime = new SimpleDateFormat("hhmmss").format(new Date());
        System.out.println(TranTime);

    }

}
