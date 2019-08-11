package com.example.java_base.thread;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 线程池调用客户端
 *
 * @author kang
 */
public class ThreadPoolExecutorTest {

   /* //池中所保存的线程数，包括空闲线程。
    final static int corePoolSize = 5;
    //池中允许的最大线程数。
    final static int maximumPoolSize = 10;
    //当线程数大于核心线程时，此为终止前多余的空闲线程等待新任务的最长时间
    final static long keepAliveTime = 200;
    //执行前用于保持任务的队列5，即任务缓存队列
    final static ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(5);

    public static void main(String[] args) {
        //构建一个线程池，正常线程数量为5，最大线程数据为10，等待时间200
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MINUTES, workQueue);

        //线程池去执行15个任务
        for (int i = 0; i < 15; i++) {
            MyRunnable myRunnable = new MyRunnable(i);
            threadPoolExecutor.execute(myRunnable);
            System.out.println("线程池中现在的线程数目是：" + threadPoolExecutor.getPoolSize() + ",  队列中正在等待执行的任务数量为：" +
                    threadPoolExecutor.getQueue().size());
        }
        //关掉线程池
        threadPoolExecutor.shutdown();*/

    public static void main(String[] args) {

        ThreadPoolTest();
    }

    public static void ThreadPoolTest() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setMaxPoolSize(50);
        threadPoolTaskExecutor.initialize();

        List<String> paymentSeqNoList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            paymentSeqNoList.add(String.valueOf(i));
        }
        Long startTime = System.currentTimeMillis();
        //线程池提交返回
        for (String paymentSeqNo : paymentSeqNoList) {
            // submit提交执行
            Future future = threadPoolTaskExecutor.submit(new MyTestCallable(paymentSeqNo));
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        threadPoolTaskExecutor.shutdown();
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时1：" + (endTime - startTime));

    }

}


class MyTestCallable implements Callable {
    String paymentSeqNo;

    MyTestCallable(String paymentSeqNo) {
        this.paymentSeqNo = paymentSeqNo;
    }

    @Override
    public String call() throws Exception {
        System.out.println("paymentSeqNo:" + paymentSeqNo);
        return paymentSeqNo;
    }
}

