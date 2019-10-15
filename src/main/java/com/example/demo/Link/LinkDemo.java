package com.example.demo.Link;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author 640804
 * @ClassName reverseLink
 * @Description 反转链表
 * @date 2019/9/10 9:22
 * @Version 1.0
 */
public class LinkDemo {

    private class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    Node head,tail;
    //构造
    public LinkDemo(){
        this.head=null;
        this.tail=null;
    }
    //插入
    public boolean addLink(int data){
        Node newNode = new Node(data, null);
        if (this.head==null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        return true;
    }

    public void String(Node head){
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+", ");
        }
        System.out.println("");
    }
    //链表反转
    public Node reverseLink(Node head){
        Node pre=null;
        Node cur=head;
        Node next=null;
        while(cur != null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
    //交换两个相邻元素
    public Node swap(Node head){
        Node pre=new Node(0,null);
        pre.next=head;
        Node temp=pre;
        while(temp.next!=null && temp.next.next!=null){
            Node start=temp.next;
            Node end=temp.next.next;
            temp.next=end;
            start.next=end.next;
            end.next=start;
            temp=start;
        }
        return pre.next;

    }

    public static void main(String[] args){
        LinkDemo link=new LinkDemo();
        link.addLink(11);
        link.addLink(22);
        link.addLink(33);
        link.addLink(44);
        link.addLink(55);
        link.String(link.head);
        link.String(link.swap(link.head));
        link.String(link.head);

        String str ="hrthdfsfafadcvmikit";
        char[] a=str.toCharArray();
        Arrays.sort(a);
        System.out.println(JSON.toJSON(a));

    }

    public Node rever(Node head){
        Node pre=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }


    public boolean hasCycle(Node head){
        Set<Node> set=new HashSet<>();
        while (head !=null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }

    public Node merge(Node l1,Node l2){
        if(l1.data<l2.data){
            l1.next=merge(l1.next,l2);
            return l1;
        }else {
            l2.next=merge(l1,l2.next);
            return l2;
        }

    }


}
