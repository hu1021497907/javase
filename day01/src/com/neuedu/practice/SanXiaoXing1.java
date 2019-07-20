package com.neuedu.practice;

import java.util.Scanner;

public class SanXiaoXing1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int f = 5; f > i; f--) {
                System.out.print("*");
            }
            System.out.println();

        }


        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int x = s.nextInt();
        System.out.println("请在输入一个数字");
        int y = s.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();

        }

    }
}
