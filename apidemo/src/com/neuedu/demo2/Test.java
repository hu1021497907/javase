package com.neuedu.demo2;

public class Test {

    public static void main(String[] args) {
        CustomArrayList<String> customArrayList = new CustomArrayList();
        customArrayList.add("admin1");
        customArrayList.add("admin2");
        customArrayList.add("admin3");
        customArrayList.add("admin4");

        String str = customArrayList.get(0);


    }

}
