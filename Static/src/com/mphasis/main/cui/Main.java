package com.mphasis.main.cui;
import com.mphasis.types.Month;
import static com.mphasis.types.Month.*;

import javax.swing.*;

//Inner Outer class
/*class Outer{
    static class Inner{
        int value;
    }
}  */
/*class Test{
    static int value; //class variable
}  */

public class Main {

    public static void main(String[] args) {
        Month mMonth;
        mMonth=FEB;
        if(mMonth == FEB)
            System.out.println("February...");

        Month[] months = values();
        for(Month month:months)
            System.out.println(month);

        Month currMonth = valueOf("MAR");

        if(currMonth == MAR)
            System.out.println("march....");

        //Inner Outer Class
        /*Outer.Inner outerInner = new Outer.Inner();
        outerInner.value=10;
        System.out.println(outerInner.value);  */


	    /*Test.value=45;
        System.out.println(Test.value);
        JOptionPane.showMessageDialog(null,"Good Afternoon","Greetings",JOptionPane.WARNING_MESSAGE); */
    }
}


