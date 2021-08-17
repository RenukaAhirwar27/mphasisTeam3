package com.mphasis.main.cui;

import com.mphasis.payroll.Employee;
import com.mphasis.payroll.Finance;
import com.mphasis.payroll.HR;
import com.mphasis.payroll.Intern;
import com.mphasis.payroll.Permanent;
import com.mphasis.payroll.Contract;

public class Main {

    public static void main(String[] args) {
        Finance finance = new Finance();
        HR hr = new HR();
        Employee employee = hr.recruit('p'); //upcast
        finance.processSalary(employee);  // Dynamic polymorphism
        //employee = new Intern();
        //finance.processSalary(employee);
        finance.processSalary(hr.recruit('I'));
        finance.processSalary(hr.recruit('c'));
    }
}
