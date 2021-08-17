package com.mphasis.main.cui;

import java.util.logging.Level;
import java.util.logging.Logger;

class Task implements Runnable{
    private static final Logger logger;
    static {
        logger = Logger.getLogger(Task.class.getName());
    }

    @Override
    public void run() {
        Thread curThread = Thread.currentThread();
    }
}

public class Main {
    private static final Logger logger;
    static {
        logger = Logger.getLogger(Main.class.getName());
    }
    public static void main(String[] args) {
        printInfo(String.valueOf(Runtime.getRuntime().availableProcessors()));
	    Thread myThread = Thread.currentThread();
        printInfo(myThread.toString());
        printInfo(myThread.getState().toString());

        Task task = new Task();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        printInfo(thread1.toString());
        printInfo(thread1.getState().toString());

        thread1.start();
        thread2.start();

        printInfo("thread 1 ----->>>>>"+thread1.getState().toString());
        printInfo("thread 2 ----->>>>>"+thread2.getState().toString());

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printInfo("thread 1 ----->>>>>"+thread1.getState().toString());
        printInfo("thread 2 ----->>>>>"+thread2.getState().toString());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printInfo(thread2.getState().toString());
        printInfo("end");
    }
    private static void printInfo(String message){
        Logger.getLogger(String.valueOf(Level.INFO),message);
        //Logger.log(Level.INFO,message);
    }
}
