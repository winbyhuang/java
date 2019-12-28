package com.winby.designPatterns.create.fatory.abstractFactory;


import com.winby.designPatterns.entity.Bag;
import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.bag.BananaBag;
import com.winby.designPatterns.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
