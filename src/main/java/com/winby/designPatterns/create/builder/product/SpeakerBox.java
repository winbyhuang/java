package com.winby.designPatterns.create.builder.product;


//音箱类
public class SpeakerBox implements Item {
    private String name;
    private float price;

    public SpeakerBox(String name,int price){
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

