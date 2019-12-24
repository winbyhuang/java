package main.java.algorithm;

import java.util.ArrayList;

/**
 * @author Winby
 * @date 2018/7/18  10:58
 * @update
 * @since v1.0.0
 */
public class RegressionLine {
    private float sumX = 0;
    private float sumY = 0;
    private float sumXX = 0;
    private float sumYY = 0;
    private float sumXY = 0;
    private float sumDeltaY2;
    private float sst;
    private float E;
    private float[] xy;
    private ArrayList<String> listX;
    private ArrayList<String> listY;
    private double XMin,XMax,YMin,YMax;
    private float a0;
    private float a1;
    private int pn;
    private boolean coefsValid;
    public RegressionLine(){
        XMax = 0;
        YMax = 0;
        pn = 0;
        xy = new float[2];
        listX = new ArrayList<>();
        listY = new ArrayList<>();
    }
    public RegressionLine(DataPoint data[]){
        pn = 0;
        xy = new float[2];
        listX = new ArrayList();
        listY = new ArrayList();
        for(int i = 0;i<data.length;++i){
            addDatapoint(data[i]);
        }
    }
    public int getDataPointCount(){
        return pn;
    }
    public float getA0(){
        validateCoefficients();
        return a0;
    }
    public float getA1(){
        validateCoefficients();
        return a1;
    }
    public double getSumX(){
        return sumX;
    }
    public double getSumY() {
        return sumY;
    }
    public double getSumXX() {
        return sumXX;
    }
    public double getSumYY() {
        return sumYY;
    }
    public double getSumXY() {
        return sumXY;
    }
    public double getXMin() {
        return XMin;
    }
    public double getXMax() {
        return XMax;
    }

    public double getYMax() {
        return YMax;
    }
    public double getYMin() {
        return YMin;
    }
    public void addDatapoint(DataPoint dataPoint){
        sumX += dataPoint.x;
        sumY += dataPoint.y;
        sumXX += dataPoint.x*dataPoint.x;
        sumYY += dataPoint.y*dataPoint.y;
        sumXY += dataPoint.x*dataPoint.y;

        if(dataPoint.x > XMax){
            XMax = dataPoint.x;
        }
        if (dataPoint.y > YMax){
            YMax = dataPoint.y;
        }
        xy[0] = dataPoint.x ;
        xy[1] = dataPoint.y ;
        if(dataPoint.x !=0 && dataPoint.y != 0){
            try{
                listX.add(pn,String.valueOf(xy[0]));
                listY.add(pn,String.valueOf(xy[1]));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        ++pn;
        coefsValid = false;
    }
    public float at(float x){
        if(pn < 2) {
            return Float.NaN;
        }
        validateCoefficients();
        return a0 + a1 * x;
    }
    private void validateCoefficients(){
        if (coefsValid) {
            return;
        }
        if (pn >= 2){
            float xBar = sumX /pn;
            float yBar = sumY /pn;
            a1 = (pn*sumXY - sumX*sumY)/(pn
                    *sumXX - sumX*sumX);
            a0 = (yBar - a1*xBar);
        }
        else {
            a0 = a1 = Float.NaN;
        }
        coefsValid = true;
    }
}
