package com.winby.designPatterns.action.observer;

/**
 * 观察者模式
 * 顾客关注了芒果，降价时通知他们
 */
public class ObserverClient {


    public static void main(String[] args) {
        MangoAttention attentions = new MangoAttention();//目标

        attentions.add(new CustomerObserver("c1"));
        attentions.add(new CustomerObserver("c2"));
        attentions.add(new CustomerObserver("c3"));
        attentions.add(new CustomerObserver("c4"));

        //到货
        attentions.perform();

    }


}
