package com.example.java_base.fordemo;

/**
 * @author zzq 2019/7/17 16:06
 * @description for循环中i++和++i的区别，两个实现效果一样但是++i效率更高，循环耗时更短
 * i++语句是需要一个临时变量取存储返回自增前的值，而++i不需要
 */
public class ForDemo {
    public static void main(String[] args) {
        Integer j = 0;
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i <1000000 ; i++) {
            j = i;
        }
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i <1000000 ; ++i) {
            j = i;
        }
        System.out.println(System.currentTimeMillis());
    }
}
