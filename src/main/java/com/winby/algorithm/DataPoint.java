package com.winby.algorithm;

/**
 * @author Winby
 * @date 2018/7/18  10:57
 * @update
 * @since v1.0.0
 */
public class DataPoint {
    public float x;
    public float y;
    public float z;

    public DataPoint(float x,float y){  //DataPoint类的构造函数
        this.x = x;
        this.y = y;
    }
    public DataPoint(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
