package com.winby.designPatterns.create.fatory;


import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.fruit.Apple;
import com.winby.designPatterns.entity.fruit.Orange;

/**
 * 吃苹果
 * 自己栽，自己摘
 */
public class Client {

    public static void main(String[] args) {
        do1();
        do2();
        do3();
    }

    public static void do1(){
        Fruit fruit = new Apple();
        fruit.draw();
        //。。。直接啃着吃，吃掉了
        System.out.println("-----------------");
    }

    public static void do2(){
        Fruit fruit = new Apple();
        fruit.draw();
        //。。。切开吃
        System.out.println("-----------------");
    }

    public static void do3(){
        Fruit fruit = new Orange("price",100);
        fruit.draw();
        //。。。榨汁运作
        System.out.println("-----------------");
    }

}
