package com.mphasis.main.cui;

import java.util.logging.Level;
import java.util.logging.Logger;

interface Printer{
    public void print(String text);
}
interface Transformer{
    int transform(String text);
}
interface Aggregate{
    String combine(String s1,String s2);
}
public class Main {

    public static void main(String[] args) {
	Printer printer1 = (str) -> System.out.println(str);
	printer1.print("Mphasis");

	printing((str) -> System.out.println(str),"Bhopal");

	Printer printer3 = System.out::println;
	printer3.print("India");

	Printer printer4 = (str) -> Logger.getLogger(Main.class.getName()).log(Level.INFO,str);
	printer4.print("I45666");

	Transformer transformer = Integer::valueOf;
	int result = transformer.transform("12");
	System.out.println(result);

	Aggregate aggregate = (txt1,txt2) -> txt1.concat(txt2);
	System.out.println(aggregate.combine("Mph","asis"));

	new Thread(() -> System.out.println(Thread.currentThread())).start(); // ()before -> represents run method
    }
    private static void printing(Printer printer,String text){
        printer.print(text);
    }
}
