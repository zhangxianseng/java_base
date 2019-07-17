package com.example.java_base.abstractclass;

/**
 * @author zzq 2019/7/17
 * @description 实现一个接口不一定要实现接口中所有的方法，例如抽象类实现一个接口可以只实现部分方法或者然后在子类中实现剩下的方法
 */
public interface DemoService {
    public String str1=null;

    String say(String str1);

    void write();

}
