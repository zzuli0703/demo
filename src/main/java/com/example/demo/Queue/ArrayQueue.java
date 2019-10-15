package com.example.demo.Queue;

import com.alibaba.fastjson.JSON;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;

/**
 * @author 640804
 * @ClassName ArrayQueue
 * @Description  数组实现队列
 * @date 2019/9/8 9:30
 * @Version 1.0
 */
public class ArrayQueue {
    int head,tail,size;
    int[] queue;

    //构造
    public ArrayQueue(int n){
        queue =new int[n];
        size=n;
        head=tail=0;
    }

    //判空
    public boolean isEmpty(){
        return head==tail;
    }

    //判满
    public boolean isFull(){
        return (tail+1)%size==head;
    }

    //插入
    public boolean addQueue(int n){
        if(isFull()){
            return false;
        }
        queue[tail]=n;
        tail=(tail+1)%size;
        return true;
    }

    //获取
    public int getQueue(){
        if(isEmpty()){
            return -1;
        }
        int temp=queue[head];
        queue[head]=0;
        head=(head+1)%size;
        return temp;
    }
    //获取首元素，不删除
    public int getHead(){
        return queue[head];
    }

    @Override
    public String toString(){
        return JSON.toJSONString(queue);
    }
}
