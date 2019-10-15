package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.Queue.ArrayQueue;
import com.example.demo.Queue.ArrayQueue2;
import com.example.demo.Queue.LinkQueue;
import org.apache.juli.OneLineFormatter;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 640804
 * @ClassName Test
 * @Description
 * @date 2019/9/8 9:49
 * @Version 1.0
 */
public class TestDemo {

    @Test
    public void arrayTest(){
        ArrayQueue2 queue=new ArrayQueue2(5);
        System.out.println(queue.toString());
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        System.out.println(queue.enQueue(50));
        System.out.println(queue.enQueue(60));
        System.out.println(queue.deQueue());
        System.out.println(queue.toString());
    }

    @Test
    public void linkQueue(){
        LinkQueue queue=new LinkQueue();
        queue.tooString();
        queue.addQueue(10);
        queue.addQueue(20);
        queue.addQueue(30);
        queue.addQueue(40);
        queue.addQueue(50);
        queue.tooString();
        System.out.println(queue.getQueue());
        System.out.println(queue.getHead());
    }

    interface IntegerMath{
        int add(int a,int b);
    }

    @Test
    public void lambda(){
       new Thread(new Runnable() {
           @Override
           public void run() {

           }
       }).start();

       new Thread(()->{

       }).start();

        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (Object feature : features) {
            System.out.println(feature);
        }

        features.forEach(System.out::println);

        HashMap map=new HashMap();
        Iterator iter =map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry=(Map.Entry) iter.next();
            Object key =entry.getKey();
            Object value=entry.getValue();
        }

        Iterator it=map.keySet().iterator();
        while (it.hasNext()){
            Object key=it.next();
            Object value=map.get(key);
        }

        List<HashMap> list = new ArrayList<>();
        HashMap map1=new HashMap();
        list.add(map1);

    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(map.containsKey(com)){
                return new int[]{map.get(com),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("没有找到解");
    }

    public static void main(String[] args) {
        //ThreadPoolExecutor
         String  str="abc";
        str.hashCode();

        int[] nums={1,6,4,4,3,7};
        int[] res=twoSum(nums,10);

        System.out.println(JSON.toJSON(res));
    }
}
