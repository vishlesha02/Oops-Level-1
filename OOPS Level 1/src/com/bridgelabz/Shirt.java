package com.bridgelabz;
/* Write a Java program to create a class called "Shirt" with instance variables "size," "color," and "price."
 Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price."
  Include a method to calculate the discount on the shirt based on  its size and a method to print the shirt's
   size, color, and discounted price*/
public class Shirt {
    private String size;
    private String color;
    private double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double calculateDiscount() {
        if (size.equalsIgnoreCase("small")) {
            return 0.1 * price;
        } else if (size.equalsIgnoreCase("medium")) {
            return 0.05 * price;
        } else {
            return 0;
        }
    }

    public void printDetails() {
        double discount = calculateDiscount();
        double discountedPrice = price - discount;
        System.out.println("Shirt Details:");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price); //
        System.out.println("Discounted Price: ₹" + discountedPrice);
    }



    public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public static void main(String[] args) {
            Shirt myShirt = new Shirt("medium", "blue", 3000.0);
            myShirt.printDetails();
            System.out.println("------------------------------------------");

            myShirt.setSize("large");
            myShirt.setColor("red");
            myShirt.setPrice(1000.0);
            myShirt.printDetails();
            System.out.println("------------------------------------------");

            myShirt.setSize("Small");
            myShirt.setColor("black");
            myShirt.setPrice(2500.0);
            myShirt.printDetails();
            System.out.println("------------------------------------------");

        }
    }


