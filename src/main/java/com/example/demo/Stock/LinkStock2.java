package com.example.demo.Stock;

/**
 * @author 640804
 * @ClassName LinkStock2
 * @Description
 * @date 2019/9/9 16:26
 * @Version 1.0
 */
public class LinkStock2 {
    private class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    Node top;
    int count;
    public LinkStock2(){
        top=null;
        count=0;
    }

    //判空
    public boolean isEmpty(){
        return count==0;
    }
    //入栈
    public boolean push(int data){
        top=new Node(data,top);
        count++;
        return true;
    }
    //出栈
    public int pop(){
        if(top.next!=null){
            Node oldTop = top;
            top = top.next;
            count--;
            oldTop.next=null;
            return oldTop.data;
        }
        if(top.next==null){
            count--;
            return top.data;
        }else {
            return -1;
        }
    }
}
