package com.winby.designPatterns.entity;


import com.winby.designPatterns.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

    int accept(Visit visit);

}
