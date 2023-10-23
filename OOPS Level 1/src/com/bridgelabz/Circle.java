package com.bridgelabz;

 // Write a Java program to create a class called "Circle" with an instance variable "radius."
 // Include a method to calculate the area of the circle and a method to calculate the circumference of the circle.
public class Circle {
    int radius;
    public final double PI=3.14;

    public Circle(int radius)
    {
        this.radius=radius;
    }

    public double calculateArea()
    {
        return PI*radius*radius;
    }
    public double calculateCircumference()
    {
        return 2*PI*radius;
    }


     public static void main(String[] args) {
         Circle c=new Circle(5);
         System.out.println("Area of circle : " + c.calculateArea());
         System.out.println("Circumference of circle : " + c.calculateCircumference());
     }
}
