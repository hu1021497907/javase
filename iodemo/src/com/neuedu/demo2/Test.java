package com.neuedu.demo2;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        InputStream in = null;

        try {
            in = new FileInputStream("iodemo\\src\\com\\neuedu\\test\\test");
            byte[] bytes = new byte[9];

            String str = "";
            int i = 0;
            while ((i = in.read(bytes)) != -1){
                str += new String(bytes,0,i,"utf-8");
            }
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
