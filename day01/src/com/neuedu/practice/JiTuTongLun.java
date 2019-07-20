package com.neuedu.practice;

import java.util.Scanner;

public class JiTuTongLun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入头的个数");
        int head = s.nextInt();
        System.out.println("请输入脚的个数");
        int foot = s.nextInt();
        int x = 0;  //鸡的个数
        int y = 0;  //兔子的个数
        if (head > 0 && foot > 0 && (foot >= 2*head) && (foot <= 4*head) && (foot % 2 ==0)){
            for (; x <= head; x++) {
                y = head - x;
                if (foot == 2 * x + 4 * y) {
                    System.out.println("鸡的个数为" + x);
                    System.out.println("兔子的个数为" + y);
                    break;
                }
            }
        }else {
            System.out.println("你输入的数据不符合规定");
        }

    }
}
