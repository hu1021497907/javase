package com.neuedu.demo3;

public class A {

    EmpDAO empDAO = new EmpDAOImpl();

    public  void test(){
        String data = empDAO.empList();
        /*
         *
         *根据data格式把data的数据显示到页面上
         *
         **/
    }

}
