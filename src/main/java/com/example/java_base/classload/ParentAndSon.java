package com.example.java_base.classload;

/**
 * @author zzq 2019/8/5 20:50
 * @description
 * 1.子类重写父类的方法
 * 向上造型子类的对象指向父类的引用的时候，调用重写方法的时候是子类的方法
 * 父类　实例 = new 子类（）
 * 实例可以调用父类中特有的方法（未在子类中覆盖的方法）
 * 实例可以调用子类中覆盖父类的方法
 * 但不可以调用子类中特有的方法（即父类中没有的方法）
 *
 * 2.子列继承父类的类加载顺序是
 * 父类静态变量/静态代码块（根据代码顺序加载）-->子类静态变量/静态代码块（根据代码顺序加载）-->父类代码块 -->父类构造方法 -->子类代码块 -->子类构造方法
 */
public class ParentAndSon {
    public static void main(String[] args) {

        Parent son = new Son();
        System.out.println("=================================");
        System.out.println(son.getValue());
    }
}

class Parent {
    int i = 1;
    Parent() {
        System.out.println("我是父类的构造方法");
        System.out.println(i);
        int x = getValue();
        System.out.println(x);
    }

    {
        i = 2;
        System.out.println("我是父类的代码块");
    }


    protected int getValue() {
        System.out.println("我是父类的普通方法");
        return i;
    }
}

class Son extends Parent{

    private static int j = 1;
    Son(){
        j = 2;
        System.out.println("我是子类的构造方法");
    }
    {
        j = 3;
        System.out.println("我是子类的方法块");
    }
    @Override
    protected int getValue() {
        System.out.println("我是子类的普通方法");
        return j;
    }
}