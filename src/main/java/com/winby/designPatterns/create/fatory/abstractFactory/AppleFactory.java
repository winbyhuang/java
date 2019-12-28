package com.winby.designPatterns.create.fatory.abstractFactory;


import com.winby.designPatterns.entity.Bag;
import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.bag.AppleBag;
import com.winby.designPatterns.entity.fruit.Apple;

/**
 * 水果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
