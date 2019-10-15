package com.example.demo.Lock;

/**
 * @author 640804
 * @ClassName lockDemo4
 * @Description
 * @date 2019/9/5 14:15
 * @Version 1.0
 */
public class lockDemo4 {
    public  static Object lock1=new Object();
    public  static Object lock2=new Object();

    public static void main(String[] args) {
        new Thread(()->{
            synchronized(lock1){
                System.out.println(Thread.currentThread().getName()+"lock1");
                try {
                    Thread.sleep(1000);
                    synchronized (lock2){
                        System.out.println("ZZZZZZZZ");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println(Thread.currentThread().getName()+"B  lock2");
                    try {
                        Thread.sleep(1000);
                        synchronized(lock1){
                            System.out.println("B lock1");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"B").start();
    }
}

