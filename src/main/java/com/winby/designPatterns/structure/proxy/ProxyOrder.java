package com.winby.designPatterns.structure.proxy;


import com.winby.designPatterns.service.OrderService;
import com.winby.designPatterns.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {

    //真实的订单服务
    private OrderService orderService = new OutOrderServiceImpl();

    @Override
    public int saveOrder() {
        System.out.println("开始海外下订单");
        return orderService.saveOrder();
    }
}
