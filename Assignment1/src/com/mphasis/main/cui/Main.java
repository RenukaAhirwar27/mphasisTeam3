package com.mphasis.main.cui;
class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){

    }
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*depth*height;
    }
}

class BoxWeight extends Box{
    double weight;
}
public class Main {

    public static void main(String[] args) {

    }
}
