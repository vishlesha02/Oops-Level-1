package com.bridgelabz;

import java.util.Scanner;

//Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight."
// Include a method to calculate the dog's age in human years and a method to print the dog's breed, age, and weight.
public class Dog {
    String breed;
    int age;
    double weight;
    private String name;

    public Dog(String breed, double weight) {
        this.breed = breed;
        this.weight = weight;
    }
    public int calculateHumanAge() {
        if (age <= 2) {
            return age * 11;
        }
        else {
            return 22 + (age - 2) * 5;
        }
    }
    public void displayAge()
    {
        System.out.println("Breed of dog : "+ breed);
        System.out.println("Age : " + age + " dog years (" + calculateHumanAge() + " Human years)");
        System.out.println("Weight of dog : "+ weight);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter age");
        int age=sc.nextInt();


        Dog d=new Dog("Golden Retriever", 25.5);
        d.name=name;
        d.age = age;
        d.displayAge();
    }
}
