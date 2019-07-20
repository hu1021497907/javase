package com.neuedu.practice;

import java.util.Scanner;

public class YinHang {

    static int money = 10000;

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();
    }

    static void showMenu(){
        while (true) {
            System.out.println("*********");
            System.out.println("1、查看余额");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、退出");
            System.out.println("请输入序号来选择功能");
            int a = s.nextInt();
            s.nextLine();
            switch (a){
                case 1:
                    seeMoney();
                    break;
                case 2:
                    addMoney();
                    break;
                case 3:
                    drawMoney();
                    break;
                case 4:
                    bankTransfer();
                    break;
                case 5:
                    hello();
                    return;
                    default:
                        System.out.println("没有此功能，请输入正确序号");
            }
        }

    }

    static void seeMoney(){
        System.out.println("余额为：" + money);
    }

    static void addMoney(){
        System.out.println("请输入存款金额");
        int add = s.nextInt();
        s.nextLine();
        money += add;
        System.out.println("恭喜你存款成功");
    }

    static void drawMoney(){
        System.out.println("请输入取款金额");
        int draw = s.nextInt();
        s.nextLine();
        if (money >= draw){
            money -= draw;
            System.out.println("恭喜你取款成功");
        }else {
            System.out.println("对不起你的余额不足,请确认你的余额重新输入");
        }
    }

    static void bankTransfer(){
        System.out.println("请输入你要转账的账号");
        long b = s.nextLong();
        System.out.println("请输入你要转账的金额");
        int transfer = s.nextInt();
        s.nextLine();
        if (money >= transfer){
            money -= transfer;
            System.out.println("恭喜你转账成功");
        }else {
            System.out.println("对不起你的余额不足,请确认你的余额重新输入");
        }
    }

    static void hello(){
        System.out.println("感谢你的使用");
    }




}
