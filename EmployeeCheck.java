package com.bridgelabz.employee;

public class EmployeeCheck {
    public static void main(String[] args) {
        int present = 1 ;
        int employeecheck = (int)Math.floor(Math.random() * 10 ) % 2 ;
        if(employeecheck==1)
        {
            System.out.println("the employee is present");
        }
        else {
            System.out.println("the employee is absent");
        }
    }
}
