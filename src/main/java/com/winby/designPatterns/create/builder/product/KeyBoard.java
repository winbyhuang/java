package com.winby.designPatterns.create.builder.product;


//键盘类
public class KeyBoard implements Item{
    private String name;
    private float price;

    public KeyBoard(String name,int price){
        this.name = name;
        this.price = price;
    }

    public String name(){
        return name;
    }
    public float price(){
        return price;
    }

}

