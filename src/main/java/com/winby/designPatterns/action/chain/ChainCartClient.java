package com.winby.designPatterns.action.chain;


import com.winby.designPatterns.action.template.OtherPayShopping;
import com.winby.designPatterns.action.template.ShoppingCart;
import com.winby.designPatterns.create.fatory.simple.StaticFactory;
import com.winby.designPatterns.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式
 * 订单费用结算过程
 */
public class ChainCartClient {

    //初始化满减优惠券
    private static MultyDiscount multyDiscount = new FullMultyDiscount(null);
    static {
        multyDiscount = new NewerMultyDiscount(multyDiscount);
        multyDiscount = new SecondMultyDiscount(multyDiscount);
        multyDiscount = new HolidayMultyDiscount(multyDiscount);


    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new OtherPayShopping(products);

        //注入优惠方案
        cart.setDiscount(multyDiscount);

        cart.submitOrder();
    }


}
