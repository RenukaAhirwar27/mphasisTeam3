package com.mphasis.spring.main;

import com.mphasis.spring.entities.EmailService;
import com.mphasis.spring.entities.JavaCollection;
import com.mphasis.spring.entities.MessageService;
import com.mphasis.spring.entities.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("config/Beans.xml");
        System.out.println("begin");

//        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
//
//        jc.getAddressList();
//        jc.getAddressSet();
//        jc.getAddressMap();
//        jc.getAddressProp();

        TextEditor textEditor=(TextEditor)context.getBean("textEditor");
        textEditor.getSpellChecker().checkSpelling();
//        MessageService messageService = (MessageService) context.getBean("email");
//        messageService.sendMessage("abc@xyz.com"," this is an email ");
//
//        messageService = (MessageService) context.getBean("email");
//        messageService.sendMessage("xyz@xabc.com"," this is an email ");
//        System.out.println(((EmailService)messageService).getPort());
//
//        messageService = (MessageService) context.getBean("email");
//        messageService.sendMessage("pqr@abc.com"," this is an email ");
//
//        ((FileSystemXmlApplicationContext)context).registerShutdownHook();
        System.out.println("End");
    }

}
