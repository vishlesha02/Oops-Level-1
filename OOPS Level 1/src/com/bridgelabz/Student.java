package com.bridgelabz;

//Write a Java program to create a class called "Student" with instance variables "name," "age," and "ID." Include a method to print the name and age of the student.
public class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;

    }
    public void display()
    {
        System.out.println("Name : " + name + " - Age : " + age + " - ID : " + id);
    }


    public static void main(String[] args) {

        Student obj1=new Student("Vijay",25,101);
        obj1.display();
        Student obj2=new Student("Vikas",23,108);
        obj2.display();

    }
}
