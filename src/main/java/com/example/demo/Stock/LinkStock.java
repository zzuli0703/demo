package com.example.demo.Stock;

import sun.awt.image.ImageWatched;

/**
 * @author 640804
 * @ClassName LinkStock
 * @Description
 * @date 2019/9/8 11:05
 * @Version 1.0
 */
public class LinkStock {
    private class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    Node top;
    int size;
    public LinkStock(){
        top = null;
        size=0;
    }

    //判空
    public boolean isEmpty(){
        return size==0;
    }
    //入栈
    public boolean push(int n){
        top=new Node(n,top);
        size++;
        return true;
    }
    //出栈
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        Node oldTop=top;
        top=top.next;
        oldTop.next=null;
        size--;
        return oldTop.data;
    }
    //访问栈顶
    public int peek(){
        return top.data;
    }
    //清空
    public void clean(){
        top=null;
        size=0;
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "[]";
        }
        StringBuffer sb=new StringBuffer("[");
        for(Node temp=top;temp!=null;temp=temp.next){
            sb.append(temp.data+", ");
        }
        int len =sb.length();
        return sb.delete(len-2,len).append("]").toString();
    }

    public static void main(String[] arge){
        LinkStock stock=new LinkStock();
        stock.push(10);
        stock.push(20);
        stock.push(30);
        stock.push(40);
        stock.push(50);
        System.out.println(stock.toString());
        System.out.println(stock.pop());
        System.out.println(stock.pop());
        System.out.println(stock);
    }

}
