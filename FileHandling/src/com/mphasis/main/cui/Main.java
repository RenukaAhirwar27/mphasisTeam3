package com.mphasis.main.cui;
import java.io.*;

public class Main {

    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
          //First
        File f1= new File("/java/COPYRIGHT");
        p("Filename : "+f1.getName());
        p("Path : "+f1.getName());
        p("Absolute path : "+f1.getAbsolutePath());
        p("Parent : "+f1.getParent());
        p(f1.exists()? "Exists":"Does not exists");
        p(f1.canWrite()? "writable":"not writable");
        p(f1.canRead()? "Readable":" not Readable");
        p(f1.isDirectory()? "directory":" not a directory");
        p(f1.isFile()? "is normal file":"might be a named pipe");
        p(f1.isAbsolute()? "absolute":" not Absolute");
        p("file last modified "+ f1.lastModified());
        p("file size "+f1.length()+"bytes\n");

            //Second
        String dirName = "/java";
        File f2 = new File(dirName);
        if(f2.isDirectory()){
            System.out.println("Directory of "+dirName);
            String s[]= f2.list();
            for(int i=0;i<s.length;i++){
                File f = new File(dirName+"/"+s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i]+"is a directory");
                }
                else{
                    System.out.println(s[i]+" is a file");
                }
            }
        }
        else{
            System.out.println(dirName+" is not a directory");
        }

    }
}
