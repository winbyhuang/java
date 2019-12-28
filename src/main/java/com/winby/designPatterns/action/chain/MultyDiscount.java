package com.winby.designPatterns.action.chain;


import com.winby.designPatterns.action.strategy.Discount;

public abstract class MultyDiscount implements Discount {
    protected MultyDiscount nextMultyDiscount;

    public MultyDiscount(MultyDiscount nextMultyDiscount){
        this.nextMultyDiscount = nextMultyDiscount;
    }

    public int calculate(int money){
        if (this.nextMultyDiscount != null){
            return this.nextMultyDiscount.calculate(money);
        }
        return money;
    }

}
