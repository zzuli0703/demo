package com.example.demo.syc;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.Executors.newCachedThreadPool;
import static java.util.concurrent.Executors.newSingleThreadExecutor;

/**
 * @author 640804
 * @ClassName sisuo
 * @Description
 * @date 2019/9/19 9:25
 * @Version 1.0
 */
public class sisuo {
    public static void main(String[] args) {

        Object ob1=new Object();
        Object ob2=new Object();
        new Thread(()->{
            synchronized (ob1){
                try {
                    System.out.println("AA线程获取ob1后尝试获取ob2");
                    Thread.sleep(1000);
                    synchronized (ob2){
                        System.out.println("AA获取ob2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"AA").start();

        new Thread(()->{
            synchronized (ob2){
                try {
                    System.out.println("BB获取ob2后，尝试获取ob1");
                    Thread.sleep(1000);
                    synchronized (ob1){
                        System.out.println("BB获取ob1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"BB").start();
    }
}
