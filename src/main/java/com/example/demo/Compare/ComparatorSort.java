package com.example.demo.Compare;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 640804
 * @ClassName ComparatorSort
 * @Description
 * @date 2019/9/11 22:59
 * @Version 1.0
 */
public class ComparatorSort {

    public static void main(String[] args) {
        List<UserBean> list= new ArrayList<>();
        UserBean user2 = new UserBean("2", "张三", "男", 20);
        UserBean user4 = new UserBean("4", "李四", "男", 40);
        UserBean user3 = new UserBean("3", "王五", "男", 30);
        UserBean user1 = new UserBean("1", "马六", "男", 10);

        list.add(user2);
        list.add(user4);
        list.add(user3);
        list.add(user1);
        System.out.println("排序前数据");
        for(UserBean userBean : list){
            System.out.println(userBean.toString());
        }
        ComparatorSort.sort(list);

        System.out.println("排序后数据");
        for(UserBean userBean : list){
            System.out.println(userBean.toString());
        }
    }

    public static void sortByAge(List<UserBean> list){
        Collections.sort(list,new Comparator<UserBean>(){
            @Override
            public int compare(UserBean u1,UserBean u2){
                String s1=u1.getId();
                String s2=u2.getId();
                return s1.compareToIgnoreCase(s2);
            }
        });
    }

    public static void sort(List<UserBean> list){
        Collections.sort(list,new Comparator<UserBean>(){
            @Override
            public int compare(UserBean u1,UserBean u2){
                return u1.getAge()-u2.getAge();
            }
        });
    }

    public static void sortList(List<UserBean> list){
        Collections.sort(list,new Comparator<UserBean>(){
            @Override
           public int compare(UserBean u1,UserBean u2){
               return u1.getAge()-u2.getAge();
           }
        });
    }
}
