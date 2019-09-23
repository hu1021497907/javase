package com.neuedu.title;

import com.neuedu.fraction.Fraction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Single {

    public int  answer = Fraction.ANSWER;
    public int  sum = Fraction.SUM;

    private static Map<String,String> Randio = new HashMap<>();

     static {
        Randio.put("第一道题  选项为：A.  1   B.  2   C.  3   D.  4","A");
        Randio.put("第二道题  选项为：A.  2   B.  1   C.  3   D.  4","A");
        Randio.put("第三道题  选项为：A.  3   B.  2   C.  1   D.  4","A");
        Randio.put("第四道题  选项为：A.  4   B.  2   C.  3   D.  1","A");
    }

    public static void Answer(){

        Scanner sc = new Scanner(System.in);

        for(Map.Entry<String, String> entry : Randio.entrySet()){
            System.out.println("key: "+ entry.getKey() + ";  ");

            String a = sc.next();
            if (a == entry.getValue()){
                System.out.println("正确");
            }else {
                System.out.println("错误");
            }
        }


    }


}
