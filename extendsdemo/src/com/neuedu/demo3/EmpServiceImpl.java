package com.neuedu.demo3;

public class EmpServiceImpl {

    EmpDAO empDAO = new EmpDAOImpl1();

    /**
     * 这个方法把数据显示到页面上
     */

    public void view(){
        String data = empDAO.empList();
        /*
        *
        *根据data格式把data的数据显示到页面上
        *
        **/

    }

}
