package com.example.demo.String;

import java.util.*;

/**
 * @author 640804
 * @ClassName StringDemo
 * @Description
 * @date 2019/9/4 9:42
 * @Version 1.0
 */
public class StringDemo {
    public static String reverse(String str){
        if(str==null || str.length()<1){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }

    public static int[] concat(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        return c;
    }

    //有序数组合并
    public static int[] merge(int[] a,int[] b){
        int i=0,j=0,k=0;
        int[] c=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }else {
                c[k]=b[j];
                k++;
                j++;
            }
        }

        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while (j<b.length){
            c[k++]=b[j++];
        }
        return c;
    }

    //用set实现
    /*public static int[] mergeArr(int[] a){
        HashSet set=new HashSet();
        set.add(Arrays.asList(a));

    }*/

    public static void main(String[] args){
        String str ="abcd";
        //System.out.println(reverse(str));

        int[] a={5,9,6,4,3,8,7};
        int[] b={6,8,5,9,7,3,2};
        Arrays.sort(a);
        int[] c=merge(a,b);
        Set set=new HashSet();
        for(int i:a){
            set.add(i);
        }
        Object[] d=set.toArray();
        System.out.println(Arrays.toString(d));




//        System.out.println(Arrays.toString(c));
//        System.out.println(set.toString());

//        System.out.println(System.currentTimeMillis());
//        System.out.println(Calendar.getInstance().getTime());
//        System.out.println(Calendar.getInstance().getTimeInMillis());
//        Date data=new Date();
//        System.out.println(data.getTime());

    }


}
