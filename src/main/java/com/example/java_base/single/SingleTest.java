package com.example.java_base.single;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2019/5/29 11:16
 */
public class SingleTest {

    public static void main(String[] args) {
        while (true) {
            /*new Thread() {
                @Override
                public void run() {
                    // 对于不同单例模式的实现，只需更改相应的单例类名及其公有静态工厂方法名即可
                    int hash = Singleton2.getSingleton2().hashCode();
                    System.out.println("+++++++++++++++++++" + hash + "+++++++++++++++++++");
                }
            }.start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 对于不同单例模式的实现，只需更改相应的单例类名及其公有静态工厂方法名即可
                    int hash = Singleton2.getSingleton2().hashCode();
                    System.out.println("+++++++++++++++++++" + hash + "+++++++++++++++++++");
                }
            }).start();*/

            ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                    new ArrayBlockingQueue<Runnable>(5));

            for(int i=0;i<15;i++){
                MyTask myTask = new MyTask(i);
                executor.execute(myTask);
                System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                        executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
            }
            executor.shutdown();

        }
    }

}

class MyTask implements Runnable {

    //锁测试
    private final static Lock lock = new ReentrantLock();

    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        try {
            System.out.println("正在执行task "+taskNum);
            Thread.currentThread().sleep(4000);
            int hash = Singleton1.getSingleton1().hashCode();
            System.out.println("+++++++++++++++++++" + hash + "+++++++++++++++++++");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
