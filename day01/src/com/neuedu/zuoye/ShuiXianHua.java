package com.neuedu.zuoye;

public class ShuiXianHua {
    public static void main(String[] args) {

        /*打印水仙花数
          三位数
        每位的三次方相加等于自身*/

//        System.out.println(153/100);   //百位
//        System.out.println(153/10%10); //十位
//        System.out.println(153%10);    //个位
        for (int i = 100; i < 1000; i++) {
            if (i == (i / 100)*(i / 100)*(i / 100)
                    +(i/10%10)*(i/10%10)*(i/10%10)
                    +(i%10)*(i%10)*(i%10)){
                System.out.println(i);
            }
        }

    }
}
