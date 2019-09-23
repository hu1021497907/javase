package com.neuedu.demo;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        System.out.println(p1.distance(p2));

        int i = 10;
        int y = 5;
        int z = --i + i++ - i-- + ++i;
        System.out.println(z);


    }

    private int age;

    public int getAge() {//获取、读取

        return age;
    }

    public void setAge(int age) {//设置

        this.age = age;
    }

    // 每一个源文件必须有且只有一个public class，并且类名和文件名保持一致！
    public class Car {

    }

    class Tyre { // 一个Java文件可以同时定义多个class
    }

    class Engine {
    }

    class Seat {
    }


    public class SxtStu { //属性（成员变量）
        int id;
        String sname;
        int age; //方法

        void study() {
            System.out.println("我正在学习！");
        }
        //构造方法
        SxtStu() {
        }
    }
}
