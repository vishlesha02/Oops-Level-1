package com.bridgelabz;

public class Phone {
    private String make;
    private String model;
    private int storage;
    private int price;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void calculate() {
        if (getPrice() == 65000) {
            setModel("Samsung");
        } else if (getPrice() == 85000 || getPrice() == 90000) {
            setModel("iPhone");
        }
    }

    public void display() {
        System.out.println("Made in : " + make);
        System.out.println("Model : " + model);
        System.out.println("Storage : " + storage);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Phone p = new Phone("India", "Samsung", 60);
        p.setPrice(65000);
        p.display();
        p.calculate();
        System.out.println("----------------------------------------");

        Phone p1 = new Phone("US", "iPhone", 256);
        p1.setPrice(85000);
        p1.display();
        p1.calculate();
        System.out.println("----------------------------------------");

        Phone p2 = new Phone("UK", "iPhone", 60);
        p2.setPrice(90000);
        p2.display();
        p2.calculate();
        System.out.println("----------------------------------------");

        Phone p3 = new Phone("Ireland", "Samsung", 256);
        p3.setPrice(70000);
        p3.display();
        p3.calculate();
    }
}
