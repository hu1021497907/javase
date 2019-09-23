package com.neuedu.demo2;

public class Test {
    public static void main(String[] args) {
        Employee e  = new Manager("张三",18,5000,3000);
        Manager m = (Manager)e;
        System.out.println(m.getMoney());


    }


}

