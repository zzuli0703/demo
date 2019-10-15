package com.example.demo.Lock;

/**
 * @author 640804
 * @ClassName Lockdemo
 * @Description
 * @date 2019/9/2 15:58
 * @Version 1.0
 */
public class Lockdemo {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            try {
                synchronized (lock1) {
                    Thread.sleep(2000);
                    System.out.println("线程1，等待lock2");
                    synchronized (lock2) {
                        System.out.println("获得lock2，线程1完成");
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }).start();

//        new Thread(() -> {
//
//        }).start();
        new Thread(() -> {
            synchronized (lock2) {
                sleep(2000);
                System.out.println("线程2，等待lock1");
                synchronized (lock1) {
                    System.out.println("线程2完成");
                }
            }
        }).start();
    }

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
