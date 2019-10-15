package com.example.demo.Search;

/**
 * @author 640804
 * @ClassName BinarySearch
 * @Description  二分查找
 * @date 2019/9/5 10:37
 * @Version 1.0
 */
public class BinarySearch {

    public static int binarySearch(int[] arr,int res){
        int l=0;
        int h= arr.length-1;
        while (l<=h){
            int mid=(l+h)/2;
            if(res==arr[mid]){
                return mid;
            }else if(res<arr[mid]){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    //递归实现
    public static int binarySearch(int[] arr,int res,int l,int h){

        if(res<arr[l] || res>arr[h] || l>h){
            return -1;
        }
        int mid=(l+h)/2;
        if(res < arr[mid]){
            return binarySearch(arr,res,l,mid-1);
        } else if (res > arr[mid]) {
            return binarySearch(arr,res,mid+1,h);
        }else{
            return mid;
        }
    }

    //arr中有重复元素，返回第一个元素下标
    public int Bsearch(int[] arr,int value){
        int n =arr.length;
        int l=0;
        int h=n-1;


        while (l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>value){
                l=mid+1;
            }
            if(arr[mid]<value){
                h=mid-1;
            }
            if(arr[mid]==value){
                if((mid==0)|| (arr[mid-1] != value)){
                    return mid;
                }else {
                    h=mid-1;
                }

            }
        }
        return -1;
    }

}
