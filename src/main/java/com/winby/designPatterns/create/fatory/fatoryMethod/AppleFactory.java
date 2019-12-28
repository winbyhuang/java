package com.winby.designPatterns.create.fatory.fatoryMethod;


import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.fruit.Apple;

/**
 * 工厂方法模式
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
