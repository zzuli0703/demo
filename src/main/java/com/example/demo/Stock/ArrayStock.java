package com.example.demo.Stock;

import java.util.Arrays;

/**
 * @author 640804
 * @ClassName ArrayStock
 * @Description
 * @date 2019/9/8 10:40
 * @Version 1.0
 */
public class ArrayStock {
    int[] stock;
    int top,size,count;
    public ArrayStock(int n){
        stock =new int[n];
        size=n;
        count=0;
    }
    //判空
    public boolean isEmpty(){
        return count==0;
    }
    //判满
    public boolean isFull(){
        return size==count;
    }
    //插入
    public boolean push(int n){
        if(isFull()){
            return false;
        }
        stock[count]=n;
        count++;
        return true;
    }
    //出栈
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int temp= stock[count-1];
        count--;
        return temp;
    }
}
