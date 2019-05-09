package com.hp.controller;

import com.alibaba.fastjson.JSONObject;
import com.hp.pojo.User;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zql on 2019/5/9.
 */
public class maopao {

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 9, 4, 1};
        System.out.println("排序前的数组为：");
        for (int before : arr) {
            System.out.println(before);
        }
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int num = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = num;
                }
            }
            System.out.println("排序后的数组为：");
            for (int after: arr) {
                System.out.println(after);

            }
        }
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-mm");
        String format = sdf.format(date);
        System.out.println(format);

        int num = 3;
        String sNum = String.valueOf(3);
        String toString = sNum.toString();
        System.out.println(toString);

       Set<Integer> set = new HashSet<>();
       set.add(1);
       set.add(3);
       set.add(2);
        for (int v: set) {
            System.out.println(v);
        }
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("jva");
        String s4 = new String("java");
        System.out.println("s1==s2"+(s1==s2));
        System.out.println("s1==s3"+(s1==s3));
        System.out.println("s1.equals(s3)"+(s1.equals(s3)));
        System.out.println("s3.equals(s4)"+s3.equals(s4));

}
}
