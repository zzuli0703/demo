package com.example.demo.Queue;

/**
 * @author 640804
 * @ClassName LinkQueue2
 * @Description
 * @date 2019/9/9 14:47
 * @Version 1.0
 */
public class LinkQueue2 {
    private class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    int count;
    Node head, tail;

    public LinkQueue2() {
        this.head = null;
        this.tail = null;
        count = 0;
    }

    //判空
    public boolean isEmpty() {
        return head == null;
    }

    //入队
    public boolean enQueue(int n) {
        Node newNode = new Node(n, null);
        if (isEmpty()) {
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail=newNode;
        return true;
    }
    //出队
    public int deQueue(){
        if(head.next!=null){
            Node te=head;
            head=head.next;
            return te.data;
        }
        if(head.next==null){
            return head.data;
        }else{
            throw new RuntimeException("");
        }
    }
    public int getHead(){
        return head.data;
    }
    public void getString(){
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.println(temp.data+", ");
        }
    }
}
