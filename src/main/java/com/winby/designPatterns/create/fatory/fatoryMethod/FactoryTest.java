package com.winby.designPatterns.create.fatory.fatoryMethod;


import com.winby.designPatterns.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 工厂方法模式测试
 */
public class FactoryTest {

    @Autowired
    private static FruitFactory fruitFactory;

    public static void main(String[] args) {
        //初始化苹果工厂
//        fruitFactory = new AppleFactory();//spring配置
        do1();
        do2();
        do3();
    }

    public static void do1(){
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        //。。。直接啃着吃，吃掉了
        System.out.println("-----------------");
    }

    public static void do2(){
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        //。。。切开吃
        System.out.println("-----------------");
    }

    public static void do3(){
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        //。。。榨汁动作
        System.out.println("-----------------");
    }

}
