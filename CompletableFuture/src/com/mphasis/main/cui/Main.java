package com.mphasis.main.cui;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        System.out.println("BEGIN");
        CompletableFuture<Integer> cFut = create();//new CompletableFuture<>();//create();
        process(cFut);
        //cFut.complete(3);
	//create().thenAccept(data -> print(data));
    }
    public static CompletableFuture<Integer> create(){
        System.out.println("Inside create : " + Thread.currentThread());
        return CompletableFuture.supplyAsync(() -> compute());
    }
    public static int compute(){
        System.out.println("Inside compute : " + Thread.currentThread());
        return 5;
    }
    public static void print(Integer data){
        System.out.println("Inside print : " + Thread.currentThread());
    }

    public static void process(CompletableFuture<Integer> cFuture){
        cFuture.thenApply(data -> data*2)
                .thenApply(data -> data + Integer.parseInt("30"))
                .exceptionally(throwable -> handle(throwable))
                .thenApply(data -> data/0)
                .exceptionally(throwable -> handle(throwable))
                .thenAccept(data -> print(data))
                .thenRun(() -> System.out.println("1"))
                .thenRun(() -> System.out.println("2"))
                .thenRun(() -> System.out.println("3"));
    }
    public static int handle(Throwable throwable)
    {
        System.out.println("ERROR " + throwable);
        return 2;
    }
}
