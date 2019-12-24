package main.java.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Winby
 * @date 2018/7/18  10:25
 * @update
 * @since v1.0.0

2 7
0.18 0.89 41000
1.0 0.26 62000
0.92 0.11 53000
0.07 0.37 29500
0.85 0.16 55600
0.99 0.41 65000
0.87 0.47 60400
4
0.49 0.18
0.57 0.83
0.56 0.64
0.76 0.18

 */
public class test2 {
    private static int MAX_POINTS = 7;
    private static int f;
    static List<Float> data2 = new ArrayList<>();

    public static void main(String args[]) {

        DataPoint[] data = new DataPoint[MAX_POINTS];
        RegressionLine line = new RegressionLine(constructDates(data));
        for (int i = 0; i < data2.size(); i++) {
            System.out.println(line.getA1() * data2.get(i) + line.getA0());
        }
    }

    private static DataPoint[] constructDates(DataPoint date[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int n;
        String fn = sc.next();
        String[] fnArray = fn.split(" ");
        f = Integer.valueOf(fnArray[0]);
        n = Integer.valueOf(fnArray[1]);
        MAX_POINTS = n;
        float x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            String data = sc.next();
            String[] dataArray = data.split(" ");
            for (int j = 0; j < f - 1; j++) {
                x = x + Float.valueOf(dataArray[j]);
            }
            y = Float.valueOf(dataArray[dataArray.length - 1]);
            date[i] = new DataPoint(x, y);
        }


        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String data = sc.next();
            String[] dataArray = data.split(" ");
            float z = 0;
            for (int j = 0; j < f ; j++) {
                z = z + Float.valueOf(dataArray[j]);
            }
            data2.add(z);
        }
        return date;
    }

}
