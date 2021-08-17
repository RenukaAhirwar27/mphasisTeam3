package com.mphasis.main.cui;
import java.util.*;

class Process{
	public Collection<String> getElements(){
		List<String> data = new LinkedList<String>();
		data.add("B");
		data.add("D");
		data.add("E");
		data.add("A");
		data.add("F");
		data.add("C");
        data.add(2,"H");
		data.set(1,"Z");
		data.remove(4);
		return data;
	}
}
class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Point point = (Point) o;
		return x == point.x && y == point.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
public class Main {

    public static void main(String[] args) {
	Process process = new Process();
	List<String> result = process.getElements();
	for(String string:result){
		System.out.println(string);
	}
		Iterator<String> iterator = result.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}

	    List<String> list = (List)result;
		ListIterator<String> listIterator = list.listIterator();

		HashSet<Point> hashSet = new HashSet<Point>();
		hashSet.add(new Point(2,4));
		hashSet.add(new Point(2,4));
		hashSet.add(new Point(2,4));

		System.out.println(hashSet);


    }
}
