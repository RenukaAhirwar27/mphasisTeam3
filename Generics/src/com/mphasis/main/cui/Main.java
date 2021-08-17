package com.mphasis.main.cui;

import java.util.concurrent.Callable;

class Point<T> {
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class Main {

    public static void main(String[] args) {
	Point<Integer> point1 = new Point<Integer>(3,4);
	Point<Float> point2 = new Point<Float>(3.5f,4.8f);
	System.out.println(point1);
	System.out.println(point1);
    }
}
