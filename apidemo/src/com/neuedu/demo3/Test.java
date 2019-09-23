package com.neuedu.demo3;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
//        Integer i = 1;//Integer i = Integer.valueOf(1);
//
//        int x = i;//int x = i.intValue();

        //如何将数字转化为字符串
        String st = "123";
        int x = Integer.parseInt(st);
        System.out.println(x);
        //字符串怎么转化成double
        double d = Double.parseDouble(st);
        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("123.456");
        BigDecimal bigDecimal1 = new BigDecimal("456");
        BigDecimal result = bigDecimal.add(bigDecimal1);
        System.out.println(result);
    }

}
