package com.mphasis.payroll;

public class Finance {
    public void processSalary(Employee employee){
        employee.netPay();
        if(employee instanceof Permanent){
            Permanent permanent = (Permanent) employee; // downcast //restore full functionality
            permanent.transportation();
        }
    }
}
