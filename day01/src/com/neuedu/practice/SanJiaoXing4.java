package com.neuedu.practice;

public class SanJiaoXing4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || j > i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
