package com.mphasis.main.cui;

import java.awt.*;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Task implements Runnable{
    private static final Logger logger;
    static {
        logger = Logger.getLogger(Main.class.getName());
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        logger.log(Level.INFO,">>>>>>>>>TASK STARTED");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.log(Level.INFO,">>>>>>>>>TASK ENDED");
    }
}

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
    private static final Logger logger;
    static {
        logger = Logger.getLogger(Main.class.getName());
    }

    public static void main(String[] args) {
        int vCPUs = Runtime.getRuntime().availableProcessors();
        //ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService service = Executors.newFixedThreadPool(vCPUs);
        //ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        //logger.log(Level.INFO,"begin");
        //service.scheduleWithFixedDelay(new Task(),5,10, TimeUnit.SECONDS);
        //service.scheduleAtFixedRate(new Task(),5,10, TimeUnit.SECONDS);
        //logger.log(Level.INFO,"submitted");
        //service.shutdown();
        //for(int counter=10;counter<20;counter++){
        //executorService.execute(new Task());}
       // executorService.shutdown();

        Future<Point> future = service.submit(new Task());

        try {
            Point point = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
