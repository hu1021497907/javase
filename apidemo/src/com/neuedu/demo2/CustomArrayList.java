package com.neuedu.demo2;

import java.util.Arrays;

/**
 * 利用数组实现线性表的结构
 */
public class CustomArrayList<T> {

    //存元素的数组
    private Object [] elementData;

    private static final Object[] DEFAULT_ELEMENT_DATA = new Object[0];

    //记录集合中有多少个元素
    private int size;

    //记录数组的长度
    private int count;

    public CustomArrayList() {
        elementData = DEFAULT_ELEMENT_DATA;
    }

    /**
     * 添加元素
     * @param obj
     */
    public void add(Object obj){
        dilatation();
        elementData[size++] = obj;

    }
    public void dilatation(){
        if (!(size < count)){
            elementData = Arrays.copyOf(elementData,count + 16);
            count += 16;
        }
    }

    /**
     * 获取元素
     * @param index
     * @return
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("下标不合理");
            return null;
        }else {
            //需要记录是什么类型
            return (T)elementData[index];
        }
    }

    /**
     * 获取有多少个元素
     * @return
     */
    public int size(){
        return size;
    }



}
