package com.winby.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Winby
 * @date 2018/7/18  12:54
 * @update
 * @since v1.0.0
 */
public class test1 {

    public static void main(String[] args) {
        Integer[] a ={2,10,14,19,51,71};
        Integer[] b ={2,9,10,14,19,40,51};
        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();
        lista.addAll(Arrays.asList(a));
        listb.addAll(Arrays.asList(b));
        List<Integer> listc =new ArrayList<>();
        while(lista.size()>0 || listb.size()>0){
           if(lista.size()==0){
               listc.add(listb.get(0));
               listb.remove(0);
           }else if(listb.size()==0){
               listc.add(lista.get(0));
               lista.remove(0);
            }else if(lista.get(0)<listb.get(0)){
                listc.add(lista.get(0));
                lista.remove(0);
            }else if(lista.get(0)>listb.get(0)){
                listc.add(listb.get(0));
                listb.remove(0);
            }else{
                listc.add(lista.get(0));
                lista.remove(0);
                listb.remove(0);
            }
        }
        System.out.println(listc.toArray().toString());
    }
}
