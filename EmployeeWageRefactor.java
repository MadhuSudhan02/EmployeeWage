package com.bridgelabz.employee;

class Employee{
    static int Present =1 , Emp_rate_per_hour =20 ;
    static int emphrs = 0, employee_wage = 0;
    void display(){
        System.out.println("Welcome to the Employee Wage ");
    }
    void dailywage(){
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if ( employeeCheck == 1)
            emphrs = 8;
        else
            emphrs = 0;
        employee_wage = emphrs * Emp_rate_per_hour ;
        System.out.println("Employee wage is " + employee_wage);

    }

}

public class EmployeeWageRefactor {
    public static void main(String[] args) {
        Employee obj = new Employee() ;
        obj.display();
        obj.dailywage();
    }

}
