package com.example.demo;

/**
 * @author 640804
 * @ClassName Singleton2
 * @Description
 * @date 2019/8/30 19:38
 * @Version 1.0
 */
public class Singleton2 {
    private Singleton2(){}
    private static volatile Singleton2 singleton2=null;
    public static Singleton2 getInstance(){
        if(singleton2== null){
            synchronized(Singleton2.class){
                if(singleton2==null){
                    singleton2=new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public static void main(String[] args){
        for(int i=0;i<10;i++){
            new Thread(new Runnable(){
                @Override
                public void run(){
                    System.out.println(Thread.currentThread().getName()+":"+Singleton2.getInstance().hashCode());
                }
            }).start();
        }
    }
}
