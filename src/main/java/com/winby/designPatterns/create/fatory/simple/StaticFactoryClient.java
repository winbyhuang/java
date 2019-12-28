package com.winby.designPatterns.create.fatory.simple;


import com.winby.designPatterns.entity.Fruit;

public class StaticFactoryClient {


    public static void main(String[] args) {
//        do1();
        do2();
//        do3();
    }

    public static void do1(){
        Fruit fruit = StaticFactory.getFruit(StaticFactory.TYPE_BANANA);
        fruit.draw();
        //。。。直接啃着吃，吃掉了
        System.out.println("-----------------");
    }

    public static void do2(){
        Fruit fruit = StaticFactory.getFruitBanana();
        fruit.draw();
        //。。。切开吃
        System.out.println("-----------------");
    }

    public static void do3(){
        Fruit fruit = StaticFactory.getFruit(StaticFactory.TYPE_APPLE);
        fruit.draw();
        //。。。榨汁动作
        System.out.println("-----------------");
    }
}
