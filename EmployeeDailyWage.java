package com.bridgelabz.employee;

public class EmployeeDailyWage {
    public static void main(String[] args) {
        int Present =1 , Emp_rate_per_hour =20 ;
        int emphrs = 0, employee_wage = 0;
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if ( employeeCheck == 1)
            emphrs = 8;
        else
            emphrs = 0;
        employee_wage = emphrs * Emp_rate_per_hour ;
        System.out.println("Employee wage is " + employee_wage);
    }
}

