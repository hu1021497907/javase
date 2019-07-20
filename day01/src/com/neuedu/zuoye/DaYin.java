package com.neuedu.zuoye;

public class DaYin {
    public static void main(String[] args) {

        //使用for循环打印斐波那契数列(1000以内)


        int x = 1;
        for (int i = 1; i < 1000; ) {
            System.out.print(i + " ");
            x = i - x;
            i += x;
        }
        char c1 = 'a';
        char c2 = 'b';
        String s = "string";
        System.out.println(c1 + 5 + c2);
    }
}
