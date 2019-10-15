package com.example.demo.Sort;

/**
 * @author 640804
 * @ClassName ShellSort
 * @Description 希尔排序，插入排序的加强版
 * @date 2019/8/28 10:55
 * @Version 1.0
 */
public class ShellSort {

    public static void shellSort(int[] a){
        int n=a.length;
        //进行分组，最开始时的增量gap为数组长度一半
        for(int gap=n/2;gap>0;gap/=2){
            //对各个分组进行插入排序
            for(int i=gap; i<n;i++){
                //将a[i]插入到分组正确位置上
                insertI(a,gap,i);
            }
        }
    }

    public static void insertI(int[] a,int gap, int i){
        int inserted =a[i];
        int j;
        //插入时按组进行插入（组内元素两两相隔gap）
        for(j=i-gap;j>=0 && inserted <a[j];j-=gap){
            a[j+gap] =a[j];
        }
        a[j+gap] =inserted;
    }

    public static void shellSort2(int[] a){
        for(int gap=a.length/2;gap>0;gap/=2){
            for(int i=gap;i<a.length;i++){
                int temp=a[i];
                int j;
                for(j=i-gap;j>=0 && a[j]>temp;j-=gap){
                    a[j+gap] =a[j];
                }
                a[j+gap] =temp;
            }
        }
    }

    public static void shellSort3(int[] a){
        for(int gap=a.length/2;gap>0;gap/=2){
            for(int i=gap;i<a.length;i++){
                for(int j=i-gap;j>=0 && a[j]>a[j+gap];j-=gap){
                    int temp=a[j+gap];
                    a[j+gap]=a[j];
                    a[j]=temp;
                }
            }
        }
    }


    public static void main(String[] args){
        System.out.println("希尔排序");
        int[] a=new int[]{2,5,6,9,4,3,1,8,7};
        shellSort3(a);
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }


}
