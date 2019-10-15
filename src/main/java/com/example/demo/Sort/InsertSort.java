package com.example.demo.Sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 640804
 * @ClassName InsertSort
 * @Description 插入排序
 * 时间复杂度O(n*n),空间复杂度O(1)
 * 小规模数据或数据基本有序时，效率高
 * @date 2019/8/28 10:57
 * @Version 1.0
 */
public class InsertSort {

    //原始算法
    public static void insertSort(int[] a, int n) {
        int k, j;
        //从第二个元素开始遍历数组 i
        for (int i = 1; i < n; i++) {
            //从指定元素的前一位开始，找到比此元素小的位置 j
            for (j = i - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    break;
                }
            }
            //把j到i之间的元素往后移一位
            if (j != i - 1) {
                int temp = a[i];
                for (k = i - 1; k > j; k--) {
                    a[k + 1] = a[k];
                }
                //把i放到j+1位置上
                a[j + 1] = temp;
            }
        }
    }


    //原始算法
    //第二遍
    public static void insertSort2(int[] a, int n) {
        /**
         * 从第二个元素开始遍历数组
         * 找到比i小的元素j
         * j到i之间的元素后移
         * i复制到j+1位置
         **/
        int i, j, k;
        for (i = 1; i < n; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    break;
                }
            }
            if (j != i - 1) {
                int temp = a[i];
                for (k = i - 1; k > j; k--) {
                    a[k + 1] = a[k];
                }
                a[k + 1] = temp;
            }
        }
    }
    //原始算法
    public static void insertSort3(int[] a, int n) {
        int i, j, k;
        for (i = 1; i < n; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    break;
                }
            }
            if (j != i - 1) {
                int temp = a[i];
                for (k = i - 1; k > j; k--) {
                    a[k + 1] = a[k];
                }
                a[j + 1] = temp;
            }
        }
    }
    //原始算法
    public static void insertSort4(int[] a) {
        int i, j, k;
        for (i = 1; i < a.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    break;
                }
            }
            if (j != i - 1) {
                int temp = a[i];
                for (k = i - 1; k >j; k--) {
                    a[k + 1] = a[k];
                }
                a[k + 1] = temp;
            }

        }
    }

    //改进，
    public static void insertSort5(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                int j;
                int temp=a[i];
                for(j=i-1;j>=0 && a[j]>temp;j--){
                    a[j+1]=a[j];
                }
                a[j+1]=temp;
            }

        }
    }

    public static void insertSort6(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                int j;
                int temp=a[i];
                for( j=i-1;j>=0 && a[j]>temp;j--){
                    a[j+1]=a[j];
                }
                a[j+1]=temp;
            }
        }
    }

    public static void insertSort7(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j =i-1;j>=0 && a[j]>a[j+1];j--){
                swap(a,j,j+1);
            }
        }
    }


    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 6, 9, 4, 3, 1, 8, 7};
        Arrays.sort(a);
        shellSort(a);
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    //原始算法
    public static void insertSort9(int[] a){
        for(int i=1;i<a.length;i++){
            int j;
            for(j=i-1;j>=0;j--){
                if(a[j]<a[i]){
                    break;
                }
            }
            int temp=a[i];
            int k;
            for (k=i-1;k>j;k--){
                a[k+1]=a[k];
            }
            a[k+1]=temp;
        }
    }
    //改进，替换
    public static void insertSort10(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j=i-1;j>=0 && a[j]>a[j+1];j--){
                swap(a,j,j+1);
            }
        }
    }

    //改进
    public static void insertSort11(int[] a){
       for(int i=1;i<a.length;i++){
           int j;
           int temp=a[i];
           for (j=i-1;j>=0 && a[j]>temp;j--){
               a[j+1]=a[j];
           }
           a[j+1]=temp;
       }
    }

    //继续改进
    public static void inseertSort12(int[] a){
       for(int i=1;i<a.length;i++){
           for(int j=i-1;j>=0 && a[j]>a[j+1];j--){
               swap(a,j,j+1);
           }
       }
    }

    //希尔排序
    public static void shellSort(int[] a){
        for(int gap=a.length/2;gap>0;gap/=2){
            for(int i=gap;i<a.length;i++){
                for(int j=i-gap; j>=0 && a[j] >a[j+gap];j-=gap){
                    swap(a,j,j+gap);
                }
            }
        }
    }

}














