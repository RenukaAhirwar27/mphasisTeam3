package com.mphasis.main.cui;
import java.util.Date;
class Point{
    int x;
    int y;
}
class Factory{
    public Point getInstance(){
        Point point = new Point();
        point.x=2;
        point.y=4;
        return point;
    }
}
class Printer{
    public void print(Point point){
        System.out.println(point.x+","+point.y);
    }
}
public class Main {
    public static void main(String[] args) {
	Factory factory = new Factory();
	Printer printer=new Printer();
	Point resultPoint = factory.getInstance();
    printer.print(resultPoint);
    System.out.println("end");
    }
}
