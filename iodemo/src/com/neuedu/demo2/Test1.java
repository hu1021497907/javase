package com.neuedu.demo2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test1 {
    public static void main(String[] args) {
        try {
            OutputStream out = new FileOutputStream("iodemo\\src\\com\\neuedu\\test\\test");
            String str = ",我很好";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
