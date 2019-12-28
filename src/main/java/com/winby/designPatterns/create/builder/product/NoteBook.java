package com.winby.designPatterns.create.builder.product;


//笔记本类
public class NoteBook implements Item{
    private String name;
    private float price;

    public NoteBook(String name,int price){
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

