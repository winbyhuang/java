package com.winby.designPatterns.create.fatory.fatoryMethod;


import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.fruit.Banana;

/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Banana();
    }
}
