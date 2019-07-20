package com.neuedu.hello;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Hello World");

        int i = 50;

        System.out.println(i);

        int x = 10;
        int y = 11;

        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        System.out.println("输出完换行");
        System.out.print("输出完不换行");
        int n = 10;
        System.out.println(n);
        /*合法标识符*/
        int abc = 1;
        int _bc = 1;
        int $bc = 1;
        int a_b = 1;
        int a$b = 1;
        int a1 = 1;
        int 变量 = 1;
        /*不合法标识符*/
//        int a bc =1;//不能包含空格
//        int 1 ab = 1;//不能以数字开头
//        int public = 1;//不能以java关键字
//        int ab% = 1;//不能包含（_ $）之外其他的特殊字符

        byte by = 12;
        short sh = 1200;
        int i1 = 12000000;
        long lo = 120000000000L;
        System.out.println(by);
        System.out.println(sh);
        System.out.println(i1);
        System.out.println(lo);

        float f = 12.11F;
        double d = 12.34567;
        System.out.println(f);
        System.out.println(d);

        float f1 = 0.1F;
        double d1 = 0.1;
        System.out.println(f1 ==d1);//false

        char c1 ='a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);

        boolean boo = true;
        System.out.println(boo);

        byte b = 12;
        short s = b;
        int i2 = s;
        long l = i2;
        float f2 = l;
        double d2 =f2;
        System.out.println(d2);

        int i3 =15;
        byte b1 = (byte) i3;//使用小括号填写要转的具体类型
        short s1 = (short) i3;//使用小括号填写要转的具体类型
        System.out.println(b1);
        System.out.println(s1);

        int i4 = 128;
        byte b2 = (byte) i4;
        System.out.println(b2);//结果为-128（128-256）


    }

}
