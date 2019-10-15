package com.example.demo;

import java.util.*;
import java.util.HashMap;
/**
 * @author 640804
 * @ClassName other
 * @Description
 * @date 2019/8/30 8:49
 * @Version 1.0
 */
public class other {
    HashMap map =new HashMap();

    Set keySet=map.keySet();
    Iterator ite = keySet.iterator();
    /*while( ite.hasNext() ){
       Object key= ite.next();
       Object value = map.get(key);
    }

    Set set =map.entrySet();
    Iterator it=set.iterator();
    while(it.hasNext()){
        Map.Entry my=(Map.Entry) it.next();
        my.getKey();
        my.getValue();
    }

    Set set1=map.entrySet();
    Iterator iter=set1.iterator();
    while(iter.hasNext()){
        Map.Entry mm= (Map.Entry)iter.next();
        mm.getKey();
        mm.getValue();

    }*/

    public static void main(String[] args){
        String[] array={"1","2","3","4","5","6"};
        List list= new ArrayList(Arrays.asList(array));

        list.add("7");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }

    MyThread thread=new MyThread();
    //thread.start();

    Mythreads mythreads=new Mythreads();
    Thread threads=new Thread(mythreads);
    //threads.start();
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("run");
    }
}

class Mythreads implements Runnable{
    @Override
    public void run(){
        System.out.println();
    }
}






//        这是在不考虑并发访问的情况下标准的单例模式的构造方式，这种方式通过几个地方来限制了我们取到的实例是唯一的。
//        1.静态实例，带有static关键字的属性在每一个类中都是唯一的。
//        2.限制客户端随意创造实例，即私有化构造方法，此为保证单例的最重要的一步。
//        3.给一个公共的获取实例的静态方法，注意，是静态的方法，因为这个方法是在我们未获取到实例的时候就要提供给客户端调用的，所以如果是非静态的话，那就变成一个矛盾体了，因为非静态的方法必须要拥有实例才可以调用。
//        4.判断只有持有的静态实例为null时才调用构造方法创造一个实例，否则就直接返回。



























