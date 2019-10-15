package com.example.demo.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @author 640804
 * @ClassName MergeSort
 * @Description 两个数组合并排序的java实现
 * https://blog.csdn.net/qq_42846655/article/details/81454195
 * @date 2019/9/16 15:53
 * @Version 1.0
 */
public class MergeSort {

    public static int[] merge(int[] a,int[]b){
        int[] c=new int[a.length+b.length]; //创建一个新数组
        int i=0;  //i用于标记数组a
        int j=0;  //j用于标记数组b
        int k=0;  //用于标记数组c

        //a，b数组都有元素时
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }else if(a[i]>b[j]){
                c[k]=b[j];
                k++;
                j++;
            }else {
                c[k]=b[j];
                k++;
                j++;
                i++;
            }
        }
        //若a有剩余
        while (i<a.length){
            c[k++]=a[i++];
        }
        //若b有剩余
        while (j<b.length){
            c[k++]=b[j++];
        }
        return c;
    }
    //打印数组
    public static void printArray(int[]  arr) {
        for(int i:arr) {
            System.out.print(i+ "  ");
        }
    }

    public static void main(String[] args) {
        int[]  a= {1,4,7,8,9,10,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
        int[]  aa= {1,10,6,5,7,9,6,8,2};
        int[] bb = {2,7,6,9,1,5};
        //调用printArray方法，并将merge方法的返回值传给printArray
        printArray(mergeArraySort(aa, bb));
    }

    public static int[] mergeArray(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=a.length,j=0;i<a.length+b.length;i++,j++){
            c[i]=b[j];
        }

//        ArrayList<Integer> list=new ArrayList();
//        for(int i=0;i<c.length;i++){
//            list.add(c[i]);
//        }
//        Collections.sort(list);
//        Integer[] inte=list.toArray(new Integer[]{});
//
//        int[] arr=new int[inte.length];
//        for(int i=0;i<inte.length;i++){
//            arr[i]=inte[i].intValue();
//        }

        TreeSet<Integer> set=new TreeSet();
        for(int i=0;i<c.length;i++){
            set.add(c[i]);
        }
        Integer[] inte=set.toArray(new Integer[]{});
        int[] arr=new int[inte.length];
        for(int i=0;i<inte.length;i++){
            arr[i]=inte[i].intValue();
        }

        return arr;
    }

    public static int[] mergeArraySort(int[] a,int[] b){
        TreeSet<Integer> set =new TreeSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        Integer[] inte=set.toArray(new Integer[]{});
        int[] arr= new int[inte.length];
        for(int i=0;i<inte.length;i++){
            arr[i]=inte[i].intValue();
        }
        return arr;
    }


}
