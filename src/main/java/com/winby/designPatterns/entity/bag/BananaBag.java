package com.winby.designPatterns.entity.bag;


import com.winby.designPatterns.entity.Bag;

/**
 * 香蕉包装
 */
public class BananaBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--香蕉使用竹萝包装");
    }
}
