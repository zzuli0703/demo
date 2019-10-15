package com.example.demo.Stock;

/**
 * @author 640804
 * @ClassName ArrayStock2
 * @Description
 * @date 2019/9/9 16:01
 * @Version 1.0
 */
public class ArrayStock2 {
    int[] stock;
    int size,count,top;
    public ArrayStock2(int n){
        this.stock=new int[n];
        this.size=n;
        this.count=0;
        this.top=0;
    }
    //判空
    public boolean isEmpty(){
        return count==0;
    }
    //判满
    public boolean isFull(){
        return size==count;
    }
    //入队
    public boolean enStock(int data){
        if(isFull()){
            return false;
        }
        stock[count]=data;
        count++;
        return true;
    }
    //出队
    public int deStock(){
        if(isEmpty()){
            return -1;
        }
        int temp=stock[count-1];
        count--;
        return temp;
    }
    //访问栈顶元素
    public int getTop(){
        if(isEmpty()){
            return -1;
        }
        return stock[count-1];
    }
}
