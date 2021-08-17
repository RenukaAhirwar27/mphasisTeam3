package com.mphasis.main.cui;

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
      public static void main(String[] args) {
    /*int nums[][];
    nums= new int[5][3];
    nums[2][1]=1;
    nums[4][1]=8; */

    Point[] points;
    points=new Point[5];
        points[2]=new Point(2,4);
        points[4]=new Point(3,6);
        for(Point point:points) {
            System.out.println(point);
        }
    /*for(int[] num1:nums){
        for(int num2:num1){
            System.out.print(num2);}
        System.out.println();
    }  */

    }

}
