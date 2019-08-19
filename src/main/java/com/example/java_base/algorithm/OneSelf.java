package com.example.java_base.algorithm;

public class OneSelf {


    public static void main(String[] args) {

        System.out.println(feibolaqi(4));
    }

    // 递归实现阶乘
    public static int jiecheng(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * jiecheng(num - 1);
    }

    // 斐波纳契数列，又称黄金分割数列，指的是这样一个数列：1、1、2、3、5、8、13、21、……
    public static int feibolaqi(int n) {
        if (n <= 2) {
            return 1;
        }
        return feibolaqi(n - 1) + feibolaqi(n - 2);
    }

}
