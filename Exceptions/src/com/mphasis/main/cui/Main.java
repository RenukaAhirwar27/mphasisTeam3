package com.mphasis.main.cui;

import java.util.logging.Level;
import java.util.logging.Logger;

class IllegalAgeException extends Exception{
    @Override
    public String getMessage(){
        return "you have to be 18 or above to register for voting";
    }
}

class Voter{
    public void register(int age)throws IllegalAgeException{
        if(age<18){
            throw new IllegalAgeException();
        }
    }
}

 class Test{
    public void testing1(){
        try {
            testing2();
        } catch (IllegalAgeException exception) {
            exception.printStackTrace();
        }
        System.out.println("testing1");
    }
     public void testing2() throws IllegalAgeException {
         testing3();
         System.out.println("testing2");
     }
     public void testing3() throws IllegalAgeException {
         testing4();
         System.out.println("testing3");
     }
     public void testing4() throws IllegalAgeException {
         new Voter().register(17);
         System.out.println("testing4");
     }
        }
public class Main {

public static final Logger logger;
static{
        logger = Logger.getLogger(Main.class.getName());
        }

    public static void main(String[] args) throws IllegalAgeException {
        logger.log(Level.INFO,"Begin");

        new Test().testing1();


        try{
              new Voter().register(25);
          }
          catch (IllegalAgeException exception){
              exception.printStackTrace();
          }


        int firstNumber=0;
        int secondNumber=0;
        try{
            firstNumber=Integer.parseInt(args[0]);
            secondNumber=Integer.parseInt(args[1]);
            int result=0;
            System.out.println(result);
            //logger.log(Level.INFO,args[0]+args[1]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            logger.log(Level.SEVERE, "java -classpath <path> com.mphasis.main.cui.Main <name>");
            try {
                System.out.println(firstNumber / secondNumber);
            } catch (ArrayIndexOutOfBoundsException exception1){
            exception.printStackTrace();}
        }
        catch (NumberFormatException | ArithmeticException exception) {
            logger.log(Level.SEVERE, "please provide valid numbers "+ exception);
        }
        //catch (ArithmeticException exception) {
         //   logger.log(Level.SEVERE, "cannot divide by zero "+ exception);
        //}
        catch (Exception exception) {
            logger.log(Level.SEVERE, "Error..... "+ exception);
        }
        finally {
            logger.log(Level.INFO,"End");
        }

    }
}
