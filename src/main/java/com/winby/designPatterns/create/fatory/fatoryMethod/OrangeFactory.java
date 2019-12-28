package com.winby.designPatterns.create.fatory.fatoryMethod;


import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.fruit.Orange;

/**
 * 工厂方法模式
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Orange("orange",80);
    }
}
