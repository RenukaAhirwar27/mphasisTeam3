package com.mphasis.main.cui;

class Arithmetic{
     int sum(int x,int y){
        return x+y;
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("begin");
	int result = new Arithmetic().sum(4,5);
        System.out.println(result);
	assert result == 10: " error  ";
        System.out.println("end");
    }

}
