package com.neuedu.practice;

import java.util.Arrays;
import java.util.Random;

public class Shuzu {
    public static void main(String[] args) {
        //给定一个长度为5的数组
        int[] arr = new int[5];
        Random r = new Random();
        //给数组的每一个位置生成一个随机数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        for (int i : arr) {
            System.out.println(i);
        }


        System.out.println();
        //冒泡排序   （从小到大排序）
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int zuida = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = zuida;
//                }
//            }
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }


        //从小到大排序
//        Arrays.sort(arr);//自动排序
//        for (int i : arr) {
//            System.out.println(i);
//
//        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;


//        for (int i : arr) {
//            if (i > max){
//                max = i;
//            }
//            if (i < min){
//                min = i;
//            }
//            sum +=i;
//        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("总和为：" + sum);
        System.out.println("平均值为" + sum / arr.length);


    }
}
