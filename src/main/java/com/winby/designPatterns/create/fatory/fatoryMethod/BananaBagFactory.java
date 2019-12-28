package com.winby.designPatterns.create.fatory.fatoryMethod;


import com.winby.designPatterns.entity.Bag;
import com.winby.designPatterns.entity.bag.BananaBag;

/**
 * 工厂方法模式
 */
public class BananaBagFactory implements BagFactory{
    public Bag getBag(){
        return new BananaBag();
    }
}
