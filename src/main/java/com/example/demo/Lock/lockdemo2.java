package com.example.demo.Lock;

/**
 * @author 640804
 * @ClassName lockdemo2
 * @Description
 * @date 2019/9/2 16:10
 * @Version 1.0
 */
public class lockdemo2 {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    private static class taskA extends Thread {
        @Override
        public void run() {
            try {
                synchronized (lock1) {
                    System.out.println("任务A获得锁1");
                    Thread.sleep(5000);
                    synchronized (lock2){
                        System.out.println("任务A获得锁2");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static class taskB extends Thread{
        @Override
        public void run(){
            try {
                synchronized(lock2){
                    System.out.println("任务B获得锁2");
                    Thread.sleep(5000);
                    synchronized(lock1){
                        System.out.println("任务B获得锁1");
                    }
                }
            }catch (Exception e){
                e.getMessage();
            }

        }
    }

    public static void main(String[] args){
        new taskA().start();
        new taskB().start();
    }
}
