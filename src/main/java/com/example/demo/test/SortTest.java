package com.example.demo.test;

import java.util.Arrays;

/**
 * @author 640804
 * @ClassName: SortTest
 * @projectName
 * @description: TODO
 * @date 2019/6/22 8:52
 **/
public class SortTest {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static int[] insertSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int current=arr[i+1];
            while (i>=0&&current < arr[i]){
                arr[i+1] =arr[i];
                i--;
            }
            arr[i+1]=current;
        }
        return arr;
    }

    public static void quickSort(int[] arr,int start,int end){
        int i=start;
        int j=end;
        int k=arr[start];

        while (i<j){
            while (i<j && arr[j]>k){
                j--;
            }
            if(i<j){
                arr[i]=arr[j];
                i++;
            }
            while (i<j && arr[i]<k){
                i++;
            }
            if(i<j){
                arr[j]=arr[i];
                j--;
            }

            arr[i]=k;
            if(i-1>start) quickSort(arr,0,i-1);
            if(j+1 < end) quickSort(arr,j+1,end);
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int[] heapSort(int[] arr){
        int len =arr.length;
         buildMaxHeap(arr);

         while (len>0){
             swap(arr,0,len-1);
             len--;
             adjustHeap(arr,0,len);
         }
        return arr;
    }

    public static void buildMaxHeap(int[] arr){
        int len =arr.length;
        for(int i=len/2 -1;i>=0;i--){
            adjustHeap(arr,i,len);
        }
    }
    public static void adjustHeap(int[] arr,int i,int len){
        int max=i;
        if(i*2+1<len && arr[i*2+1]>arr[max]){
            max =i*2+1;
        }
        if(i*2+2<len && arr[i*2+2]>arr[max]){
            max=i*2+2;
        }
        if(max != i){
            swap(arr, max, i);
            adjustHeap(arr,max,len);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 15, 2, 18, 7, 1, 12};
        System.out.println("原数组：" + Arrays.toString(arr));

        //quickSort(arr,0,arr.length-1);
        int[] res=heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
