package com.winby.designPatterns.entity.fruit;


import com.winby.designPatterns.action.visit.Visit;
import com.winby.designPatterns.entity.Fruit;
import com.winby.designPatterns.entity.bag.OrangeBag;

/**
 * 桔子
 */
public class Orange implements Fruit {
    private String name = "";
    private int price = 70;

    public Orange(String name,int price){
        this.price = price;
        this.name = name;
    }

    public void pack(OrangeBag bag){
        bag.pack();
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.print("砂糖桔");
    }

    public int accept(Visit visit){
        return visit.sell(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
