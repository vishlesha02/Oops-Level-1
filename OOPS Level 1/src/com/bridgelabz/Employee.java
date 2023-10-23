package com.bridgelabz;

// Write a Java program to create a class called "Employee" with instance variables "name," "salary," and "ID." Include a method to calculate the employee's yearly salary and a method to print the employee's name and salary.

public class Employee {

    private String name;
    private int salary;
    private int id;

    Employee(String name,int id,int salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public double salaryPerYear()
    {
        return salary*12;     }
    public void display()
    {
        System.out.println("Name : " + name + " | Salary : " + salaryPerYear());
    }

    public static void main(String[] args) {
        Employee obj=new Employee("Vijay",101,20000);
        obj.display();
        Employee obj2=new Employee("Vikas",102,30000);
        obj2.display();
    }
}
