package com.mphasis.main.cui;

import java.util.logging.Level;
import java.util.logging.Logger;
class Data{
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class Task implements Runnable{
    private static final Logger logger;
    Data data;
    static {
        logger =  Logger.getLogger(Task.class.getName());
    }
    Task(){
        data = new Data();
    }

    @Override
    public void run() {
        Thread currThread = Thread.currentThread();
        printInfo(currThread.toString()+counter);
        for(int counter=0;counter<10;counter++)
            printInfo(currThread.toString()+counter);
        if(currThread.getName().equals("Producer")){
            data.setValue(counter);
        }else if(currThread.getName().equals("Consumer")){
            System.out.println(data.getValue());
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Thread myThread = Thread.currentThread();
        printInfo(myThread.toString());
        printInfo(myThread.getState().toString());
        Task task = new Task();
        Thread thread1 = new Thread(task);
        System.out.println(thread1);

        printInfo(thread1.toString());
        printInfo(thread1.getState().toString());

        thread1.start();
        printInfo(thread1.getState().toString());

    }
    private static void printInfo(String message){
        //Logger.getLogger(String.valueOf(Level.INFO),message);
        Logger.log(Level.INFO,message);
    }
}
