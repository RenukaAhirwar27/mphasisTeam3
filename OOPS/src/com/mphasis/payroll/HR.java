package com.mphasis.payroll;

public class HR {
    public Employee recruit(char empType){
        if(empType == 'I' || empType == 'i'){
            return new Intern();
        }
        else if(empType == 'p' || empType == 'P'){
            return new Permanent();
        }
        else if(empType == 'c' || empType == 'C'){
            return new Contract();
        }
        return null;
    }
}
