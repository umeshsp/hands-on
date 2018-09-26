package com.multi.thread;

public class MyThreadExtends extends Thread {

    public MyThreadExtends(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("MyThreadExtends - START " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadExtends - END " + Thread.currentThread().getName());
    }
}