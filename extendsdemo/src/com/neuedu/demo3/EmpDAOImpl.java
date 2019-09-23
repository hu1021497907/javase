package com.neuedu.demo3;

public class EmpDAOImpl implements EmpDAO{

    /**
     * 用这个方法模拟数据库中查询所有员工数据
     * @return
     */
    @Override
    public String empList(){
        return "[{name:张三,age:18}{name:李四,age:19}]";
    }

}
