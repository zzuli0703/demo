package com.example.demo.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

/**
 * @author 640804
 * @ClassName QuickSort
 * @Description 快速排序
 * 时间复杂度最坏O(n*n) 平均O(nlog2n)
 * 空间复杂度 O(log2n)
 * 不稳定算法
 * @date 2019/8/28 10:57
 * @Version 1.0
 */
public class QuickSort {
    public static void quickSort(int[] a, int l, int r) {
        if (r > l) {
            int i, j, k;
            i = l;
            j = r;
            k = a[i];
            while (i < j) {
                while (j > i && a[j] > k) {
                    j--;
                }
                if (j > i) {
                    a[i] = a[j];
                    i++;
                }
                while (j > i && a[i] < k) {
                    i++;
                }
                if (j > i) {
                    a[j] = a[i];
                    j--;
                }
            }
            a[i] = k;
            quickSort(a, l, i - 1);
            quickSort(a, i + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 6, 9, 4, 3, 1, 8, 7,6,5,7,8};
        Vector vector=new Vector();
        vector.add(2);
        vector.add(3);
        vector.add(2);
        vector.add(3);


        HashSet set =new HashSet(vector);
        Object arr=set.toArray();

        //System.out.println(Arrays.toString(arr));

//        quickSort2(a, 0, a.length - 1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//        }
    }

    //再
    public static void quickSort2(int[] a,int l,int r){
        if(l<r){
            int i,j,k;
            i=l;
            j=r;
            k=a[i];
            while(i<j){
                while( i<j && a[j]>k){
                    j--;
                }
                if(i<j){
                    a[i]=a[j];
                    i++;
                }
                while(i<j && a[i]<k){
                    i++;
                }
                if(i<j){
                    a[j]=a[i];
                    j--;
                }
            }
            a[i]=k;
            quickSort2(a,l,i-1);
            quickSort2(a,i+1,r);
        }
    }
}

















