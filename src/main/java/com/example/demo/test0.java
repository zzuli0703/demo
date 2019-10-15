package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author 640804
 * @ClassName test0
 * @Description
 * @date 2019/9/21 21:36
 * @Version 1.0
 */
public class test0 {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationfile.xml");
    TreeSet<Integer> set=new TreeSet();

    public boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Integer[] data={1,2,3,6};
        Arrays.sort(data,Integer::compareTo);

        char[] char1=s1.toCharArray();
        char[] char2=s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1,char2);
    }

    public boolean isAnagram2(String s1,String s2){
        int[] count =new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

    public int bsearch(int[] a,int n,int value){
        int low=0;
        int hight=n-1;
        while(low<hight){
            int mid=low+((hight-low)>>1);
            if(a[mid]>value){
                hight=mid-1;
            }else if(a[mid]<value){
                low=mid+1;
            }else{
                if(mid ==n-1||a[mid +1]!=value) {
                    return mid;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String
        SimpleDateFormat.format();
        DateTimeFormatter.ofPattern()
        int[] arr={1,2,3,4,5,6};
        List list=Arrays.asList(arr);
        list.get(0);
        System.out.println( list.get(0).toString());
        System.out.println(list.get(1));
    }
}















