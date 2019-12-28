package com.winby.designPatterns.action.observer.jdk;

/**
 * 观察者模式
 * 顾客关注了芒果商品，到货时通知他们
 */
public class JdkObserverClient {


    public static void main(String[] args) {
        Mango attentions = new Mango("芒果");

        attentions.addObserver(new Customer("c1"));
        attentions.addObserver(new Customer("c2"));
        attentions.addObserver(new Customer("c3"));
        attentions.addObserver(new Customer("c4"));

        attentions.perform();

    }


}
