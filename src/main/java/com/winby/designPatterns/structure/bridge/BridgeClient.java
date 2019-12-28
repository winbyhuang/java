package com.winby.designPatterns.structure.bridge;


import com.winby.designPatterns.structure.bridge.bag.BagAbstraction;
import com.winby.designPatterns.structure.bridge.bag.SmallBag;
import com.winby.designPatterns.structure.bridge.material.Material;
import com.winby.designPatterns.structure.bridge.material.Paper;

/**
 * 园丁采摘水果　　　　　　　　　　　　　　　　　　　　　　 　
 */
public class BridgeClient {

    public static void main(String[] args) {

        //袋子型号
        BagAbstraction bag = new SmallBag();

        //袋子材质
        Material material = new Paper();
        bag.setMaterial(material);

        //开始采摘
        bag.pick();
    }
}
