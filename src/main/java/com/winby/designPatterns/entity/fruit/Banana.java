package com.winby.designPatterns.entity.fruit;


import com.winby.designPatterns.action.visit.Visit;
import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.bag.BananaBag;

/**
 * 桔子
 */
public class Banana implements Fruit {
    private int price = 60;
    @Override
    public int price() {
        return price;
    }

    public void pack(BananaBag bag){
        bag.pack();
    }
    @Override
    public void draw() {
        System.out.print("仙人蕉");
    }

    public int accept(Visit visit){
        return visit.sell(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
