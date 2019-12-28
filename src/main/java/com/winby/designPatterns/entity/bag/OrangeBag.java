package com.winby.designPatterns.entity.bag;


import com.winby.designPatterns.entity.Bag;

/**
 * 桔子包装
 */
public class OrangeBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--桔子使用网兜包装");
    }
}
