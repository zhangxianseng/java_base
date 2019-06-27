package com.example.java_base.single;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/5/29 11:16
 */
public class SingleTest {

    public static void main(String[] args){
        while (true){
            new Thread(){
                public void run(){
                    System.out.println(this.getName() + "######" + SingleDemo.getHungeryInstence());
                }
            }.start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SingleDemo.getHungeryInstence());
                }
            }).start();
        }
    }

}
