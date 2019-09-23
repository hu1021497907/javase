package com.neuedu.test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        System.out.println("1.单选题，每道题10分");
        System.out.println("有几种基本数据类型");
        System.out.println("A. 8种  B. 10种  C. 11种  D. 12种");
        System.out.println("2.多选题，每道题10分");
        System.out.println("下列哪些是引用数据类型");
        System.out.println("A. 类  B. 接口  C. 数组  D. 方法");
        System.out.println("3.填空题，每个空5分");
        System.out.println("面向对象的三大特性有封装,____,_____。");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一道题的答案");
        String daan1 = s.next();
        if (daan1 == "A"){

        }else {
            System.out.println("抱歉，你回答错了");
        }

        System.out.println("请输入第二道题的答案");
        String daan2 = s.next();

        System.out.println("请输入第三道题的第一个空的答案");
        String daan3 = s.next();

        System.out.println("请输入第三道题的第二个空的答案");
        String daan4 = s.next();

    }
}
