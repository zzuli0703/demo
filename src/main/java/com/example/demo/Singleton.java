package com.example.demo;

/**
 * @author 640804
 * @ClassName Singleton
 * @Description
 * @date 2019/8/30 19:02
 * @Version 1.0
 */
public class Singleton {
//    private static Singleton singleton;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if(singleton == null){
//            singleton=new Singleton();
//        }
//        return singleton;
//    }

    private static volatile Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if(singleton ==null){
            synchronized(Singleton.class){
                if(singleton ==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
