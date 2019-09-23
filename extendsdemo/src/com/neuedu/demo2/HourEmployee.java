package com.neuedu.demo2;

public class HourEmployee extends Employee {

    private int hourMoney;
    private int workHour;

    public HourEmployee(int hourMoney, int workHour) {
        this.hourMoney = hourMoney;
        this.workHour = workHour;
    }

    public HourEmployee(String name, int age, double salary, int hourMoney, int workHour) {
        super(name, age, salary);
        this.hourMoney = hourMoney;
        this.workHour = workHour;
    }

    public int getHourMoney() {
        return hourMoney;
    }

    public void setHourMoney(int hourMoney) {
        this.hourMoney = hourMoney;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getMoney() {
        return getHourMoney() * getHourMoney();
    }

}
