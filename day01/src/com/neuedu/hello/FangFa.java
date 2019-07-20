package com.neuedu.hello;

import java.util.Scanner;

public class FangFa {
    public static void main(String[] args) {

        int[] arr = {3,32,35,366,132,321,4,5};

        //数组的复制
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的扩容
        int[]arr2 = new int[arr.length + 5];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        //数组的裁剪
        int[]arr3 = new int[arr.length-2];
        for (int i = 2; i < arr.length; i++) {
            arr3[i-2] = arr[i];
            System.out.print(arr3[i-2] + ",");//{35,366,132,321,4,5}
        }




        System.out.println();

        sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }


//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入你想查询该数组中是否有的数字");
//        int b = s.nextInt();

//        boolean a = chaZhao(arr,b);
//        System.out.println(a);



        //查找一个数组中是否含有4
//        int left = 0;
//        int right = arr.length-1;
//
//        while (true){
//            if (arr[(left + right) / 2] == 4){
//                System.out.println(arr[(left + right) / 2]);
//                break;
//            }else  if (4 > arr[(left + right)/2]){
//                left = (left + right)/2;
//            }else {
//                right = (left + right)/2;
//            }
//        }

    }


    //先排序(从小到大排序)
    /**
     * 查询数组中是否含有某个数字
     * @param arr  查询的数组
     * @param target  需要查询的数字
     * @return
     */
//    static boolean chaZhao(int[] arr,int target){
//        sort(arr);
//
//        int left = 0;
//        int right = arr.length-1;
//
//        boolean flag = false;
//
//        while (true){
//            if (arr[(left + right) / 2] == target){
//                System.out.println(arr[(left + right) / 2]);
//                flag = true;
//                break;
//            }else  if (target > arr[(left + right)/2]){
//                left = (left + right)/2;
//            }else {
//                right = (left + right)/2;
//            }
//            if (left == right-1){
//                break;
//            }
//        }
//        return flag;
//    }







    /**
     * 冒泡排序法(从小到大排序)
     * @param arr 给出的数组
     */
//     static void sort (int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//
//    }


    /**
     *  希尔排序(从小到大排序)
     * @param arr  给出的数组
     * @return
     */
//    static int[] sort (int[]arr){
//        int len = arr.length;
//        int temp, gap = len / 2;
//        while (gap > 0) {
//            for (int i = gap; i < len; i++) {
//                temp = arr[i];
//                int preIndex = i - gap;
//                while (preIndex >= 0 && arr[preIndex] > temp) {
//                    arr[preIndex + gap] = arr[preIndex];
//                    preIndex -= gap;
//                }
//                arr[preIndex + gap] = temp;
//            }
//            gap /= 2;
//        }
//        return  arr;
//    }


    /**
     * 选择排序(从小到大排序)
     * @param arr  给出的数组
     * @return
     */
    static int[] sort (int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int a = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[a]){
                    a = j;
                }
            }
            int temp = arr[a];
            arr[a] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
