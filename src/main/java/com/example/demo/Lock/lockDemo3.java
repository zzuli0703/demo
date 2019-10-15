package com.example.demo.Lock;

/**
 * @author 640804
 * @ClassName lockDemo3
 * @Description
 * @date 2019/9/2 19:19
 * @Version 1.0
 */
public class lockDemo3 {
    private static Object lock1=new Object();
    private static Object lock2=new Object();

    public static void main(String[] args){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    synchronized(lock1){
                        Thread.sleep(2000);
                        System.out.println("线程1获得lock1");
                        synchronized(lock2){
                            System.out.println("线程1获得lock2");
                        }
                    }
                }catch (Exception e){}
            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized(lock2){
                    System.out.println("线程2获得lock2");
                    synchronized(lock1){
                        System.out.println("线程2获得lock1");
                    }
                }
            }
        }).start();
    }
}
