package com.dnp.test.modular.controller;

/**
 * Created by huazai on 2019/1/18.
 */
public class MyThread extends Thread {

    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程" + threadName + "运行 : " + i);
            try {
//                sleep((int) Math.random() * 10);
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+":main主线程运行开始!");
        MyThread mTh1=new MyThread("A");
        MyThread mTh2=new MyThread("B");
        mTh1.setPriority(Thread.MAX_PRIORITY);
        mTh2.setPriority(Thread.MIN_PRIORITY);
        mTh1.start();
        mTh2.start();
        System.out.println(Thread.currentThread().getName()+ ":main主线程运行结束!");
    }

}

