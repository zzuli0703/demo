package com.example.demo.Sort;

/**
 * @author 640804
 * @ClassName BubbleSort
 * @Description 冒泡排序
 *  时间复杂度O(n*n) 空间复杂度O(1)
 *  是稳定的算法
 * @date 2019/8/28 10:56
 * @Version 1.0
 */
public class BubbleSort {

    public static void bubbleSort(int[] a){
        int n= a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }

            }
        }
    }
    //上面那种可以优化，
    // 比如 8 1 2 3 5 7，进行一次排序之后，结果就变成了 1 2 3 5 7 8
    //就不用了在循环了
    //加个变量判断
    public static void bubbleSort2(int[] a){
        boolean exchange;
        for(int i=0;i<a.length;i++){
            exchange =false;
            for(int j=0;j<a.length-1-i;j++){
                if (a[j] > a[j+1]) {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    exchange=true;
                }
            }
            if(!exchange){
                return;
            }
        }
    }

    public static void main(String[] args){
        int[] a = new int[]{2,5,6,9,4,3,1,8,7};
        bubbleSort2(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

