package com.mphasis.spring.entities;

public class TwitterService implements MessageService{
    public TwitterService(){
        System.out.println("Twitter service instantiated");
    }
    public void initTwitterService(){
        System.out.println("Twitter service initialised");
    }
    @Override
    public void sendMessage(String recepient,String message){
        System.out.println("Tweet"+message+"sent to"+recepient);
    }
    public void destroyTwitterService(){
        System.out.println("Twitter service initialised");
    }
}
