package com.example.demo.subject;

import com.example.demo.test.Son;

/**
 * @author 640804
 * @ClassName Mian
 * @Description
 * @date 2019/9/11 16:28
 * @Version 1.0
 */
public class Mian {
    public static int plus(int i){
        try{
            ++i;

        }finally {
            return i++;
        }
    }


    public static void main(String[] args){
        Father obj=new Son();
        obj.display();
        System.out.println(plus(5));

    }
}
