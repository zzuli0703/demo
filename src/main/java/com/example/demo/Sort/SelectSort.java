package com.example.demo.Sort;

/**
 * @author 640804
 * @ClassName SelectSort
 * @Description 选择排序
 * 时间复杂度O(n*n),空间复杂度O(1)
 * @date 2019/8/28 10:58
 * @Version 1.0
 */
public class SelectSort {
    public static void selectSort(int[] a){
        for(int i=0;i<a.length;i++){
            int min=i;//最小元素的下标
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                   min=j;
                }
            }
            int temp =a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 6, 9, 4, 3, 1, 8, 7};
        selectSort3(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    //再
    public static void selectSort2(int[] a){
        int min;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }


    //三
    //遍历找到最小元素的下标
    //
    public static void selectSort3(int[] a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            swap(a,i,min);
        }
    }

    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
