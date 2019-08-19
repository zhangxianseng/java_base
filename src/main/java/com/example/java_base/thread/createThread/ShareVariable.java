package com.example.java_base.thread.createThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzq 2019/8/16 16:17
 * @description
 */
public class ShareVariable extends Thread {

    private volatile int count = 3;

    public ShareVariable(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0){
            count--;
            System.out.println("由 " + ShareVariable.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        //ShareVariable mythread = new ShareVariable();
        //Thread a = new Thread(mythread,"A");
        //Thread b = new Thread(mythread,"B");
        //Thread c = new Thread(mythread,"C");
        //a.start();
        //b.start();
        //c.start();

        List<Thread> listThread = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listThread.add(new ShareVariable(String.valueOf(i)));
        }
        for (Thread thread : listThread){
            thread.start();
        }
    }
}
