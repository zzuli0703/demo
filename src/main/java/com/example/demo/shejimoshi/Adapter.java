package com.example.demo.shejimoshi;

/**
 * @author 640804
 * @ClassName Adapter
 * @Description
 * @date 2019/9/15 21:12
 * @Version 1.0
 */


// 适配器类，继承了被适配类，同时实现标准接口
public class Adapter extends Adaptee implements Targer{
    @Override
    public void request(){
        super.spRequest();
    }

    public static void main(String[] args) {
        Targer conTarger = new ConTarget();
        conTarger.request();

        Targer adapter = new Adapter();
        adapter.request();
    }

}

// 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
class Adaptee{
    public void spRequest(){
        System.out.println("特殊功能。。。");
    }
}

// 目标接口，或称为标准接口
interface Targer{
    public void request();
}

// 具体目标类，只提供普通功能
class ConTarget implements Targer{
    @Override
    public void request(){
        System.out.println("普通功能");
    }
}

