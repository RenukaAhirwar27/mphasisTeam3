package com.mphasis.spring.entities;

public class EmailService implements MessageService{
    private int port;
    public EmailService(){
        System.out.println("Email service instantiated");
    }
//    public void initEmailService(){
//        System.out.println("Email service initialised");
//    }
    @Override
    public void sendMessage(String receipient,String message){
        System.out.println(" message :"+message+"sent to "+receipient);
    }
//    public void destroyEmailService(){
//        System.out.println("Email service destroyed");
//    }

    public int getPort(){
        return port;
    }

    public void setPort(int port){
        this.port=port;
    }
}
