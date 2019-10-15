package com.example.demo.Queue;

import com.alibaba.fastjson.JSON;

/**
 * @author 640804
 * @ClassName LinkQueue
 * @Description 链实现队列
 * @date 2019/9/8 9:59
 * @Version 1.0
 */
public class LinkQueue {

    private class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head, tail;

    public LinkQueue() {
        this.head = null;
        this.tail = null;
    }

    //判空
    public boolean isEmpty() {
        return head == null;
    }

    //插入
    public boolean addQueue(int n) {
        Node newNode = new Node(n, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        return true;
    }

    //取首
    public int getQueue() {
        if(head.next !=null){
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        if(head.next==null){
            return head.data;
        }else {
            return -1;
        }

    }

    //不删除
    public int getHead() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }


    public void tooString() {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data+", ");
        }
    }

}
