package com.neuedu.practice;

public class ZiMu {
    public static void main(String[] args) {
//       for (int i = 97; i < 123; i++) {
//                System.out.print((char)i);
//        }
//        for (int f = 121; f >= 97; f--) {
//            System.out.print((char)f);
//        }


        for (int i = 97; i < 148; i++) {
            if (i < 123){
                System.out.print((char) i);
            }else {
                System.out.print((char)(244-i));
            }
        }



    }
}
