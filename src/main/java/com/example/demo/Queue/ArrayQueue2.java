package com.example.demo.Queue;

import com.alibaba.fastjson.JSON;

/**
 * @author 640804
 * @ClassName ArrayQueue2
 * @Description
 * @date 2019/9/9 14:37
 * @Version 1.0
 */
public class ArrayQueue2 {
    int[] queue;
    int size,head,tail;

    public ArrayQueue2(int n){
        this.queue=new int[n];
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
    //入队
    public boolean enQueue(int n){
        if(isFull()){
            return false;
        }
        queue[tail]=n;
        tail=(tail+1)%size;
        return true;
    }
    //出队
    public int deQueue(){
        if(isEmpty()){
            return -1;
        }
        int temp =queue[head];
        queue[head]=0;
        head = (head+1)%size;
        return temp;
    }
    @Override
    public String toString(){
        return JSON.toJSON(queue).toString();
    }

}
