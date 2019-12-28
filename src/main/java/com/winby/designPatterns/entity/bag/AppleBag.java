package com.winby.designPatterns.entity.bag;


import com.winby.designPatterns.entity.Bag;

/**
 * 苹果包装
 */
public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--苹果使用纸箱包装");
    }
}
