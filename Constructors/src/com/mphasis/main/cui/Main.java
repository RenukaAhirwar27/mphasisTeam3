package com.mphasis.main.cui;
class Base{
    public void test(){
        System.out.println("TEst in base");
    }
}
class Derived extends Base{
    @Override
    public void test(){
        super.test();
        System.out.println("test in derived");
    }
}
public class Main {

    public static void main(String[] args) {
	Derived derived = new Derived();
	derived.test();
    }
}
