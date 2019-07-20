package com.neuedu.demo;

public class Point {

    double x;
    double y;

    public Point(double x1,double y1){
        x = x1;
        y = y1;
    }
    public void setX(double x1){
        x = x1;
    }
    public void setY(double y1){
        y = y1;
    }
    public double distance(Point point){
        double result =0.0;
        result = Math.pow(point.x -x,2) + Math.pow(point.y - y,2);
        result = Math.sqrt(result);
        return result;
    }


}
