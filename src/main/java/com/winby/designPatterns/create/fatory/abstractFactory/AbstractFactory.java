package com.winby.designPatterns.create.fatory.abstractFactory;


import com.winby.designPatterns.entity.Bag;
import com.winby.designPatterns.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract Fruit getFruit();

    public abstract Bag getBag();

}
