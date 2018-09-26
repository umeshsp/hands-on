package com.multi.thread;

public class ThreadRunExample {

    public static void main(String[] args){
        Thread t1 = new Thread(new MultiThreadRunnable(), "t1");
        Thread t2 = new Thread(new MultiThreadRunnable(), "t2");

        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
        Thread t3 = new MyThreadExtends("t3");
        Thread t4 = new MyThreadExtends("t4");
        System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        System.out.println("MyThreads has been started");

    }
}