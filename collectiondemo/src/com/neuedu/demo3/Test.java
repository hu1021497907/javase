package com.neuedu.demo3;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        HashMap<String,Person> map = new HashMap<>();
        map.put("张三",new Person(1,"张三") );
        map.put("王五",new Person(2,"王五") );
//        System.out.println(map.get("李四"));

        System.out.println(map.getOrDefault("李四",new Person(3,"李四")));

//        TreeMap<Integer,Person> map = new TreeMap<>();
//        map.put(1,new Person(1,"张三") );
//        map.put(2,new Person(2,"王五") );
//        System.out.println(map.get(1));

        //遍历
//        Collection<Person> c = map.values();
//        for (Person person : c) {
//            System.out.println(person);
//
//        }

//        Set<String> set = map.keySet();
//        for (String s : set) {
//            System.out.println(s);
//            System.out.println(map.get(s));
//
//        }

        Set<Map.Entry<String,Person>> set = map.entrySet();
        for (Map.Entry<String, Person> entry : set) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
