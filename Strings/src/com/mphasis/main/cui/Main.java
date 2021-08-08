package com.mphasis.main.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string1=new String("First");
        String string2= new String("First");
        String string3="First";
        String string4="First";
        System.out.println(string1==string2);
        System.out.println(string3==string4);
        System.out.println(string3.equals(string4));
        System.out.println(string3.equalsIgnoreCase(string4));
    }
}
