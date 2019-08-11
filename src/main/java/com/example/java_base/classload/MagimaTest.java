package com.example.java_base.classload;

/**
 * @author zzq 2019/8/5 18:55
 * @description
 */
public class MagimaTest {
    public static void main(String[] args) {
        magimaFunction();
    }

    static MagimaTest st = new MagimaTest();

    static{
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    MagimaTest(){
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void magimaFunction(){
        System.out.println("4");
    }

    int a = 110;
    static int b = 112;
}
