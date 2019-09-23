package com.neuedu.test;

public class Cat extends Animal {

    private String haircolor;
    private int footCount;

    public Cat(String name, int age, String sex, String haircolor, int footCount) {
        super(name, age, sex);
        this.haircolor = haircolor;
        this.footCount = footCount;
    }

//    public Cat(String name, int age, String sex) {
//        super(name, age, sex);
//    }


}

