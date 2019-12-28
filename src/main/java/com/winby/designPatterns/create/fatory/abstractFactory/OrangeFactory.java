package com.winby.designPatterns.create.fatory.abstractFactory;


import com.winby.designPatterns.entity.Bag;
import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.bag.OrangeBag;
import com.winby.designPatterns.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("orange",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
