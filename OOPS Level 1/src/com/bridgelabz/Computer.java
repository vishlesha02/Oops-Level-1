package com.bridgelabz;

//Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage."
// Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity and a method to print the computer's processor, RAM, and storage capacity.
public class Computer {
    protected String processor;
    protected int ram;
    protected int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void priceOfComputer()
    {
    }
    public void display()
    {
        System.out.println("Processor : " + processor);
        System.out.println("Ram : " + ram);
        System.out.println("Storage : " + storage);
    }
}

class GamingComputer extends Computer
{
    public  GamingComputer(String processor, int ram, int storage)
    {
        super(processor,ram,storage);
    }
    public void priceOfComputer()
    {
        if(processor.equals("i6") && ram==60 && storage==512)
        {
            System.out.println("Price " + 60000);
        }
        else if(processor.equals("i7")&& ram==80 && storage==712)
        {
            System.out.println("Price " + 85000);
        }
        else if(processor.equals("i9")&& ram==90 && storage==912)
        {
            System.out.println("Price " + 90000);
        }
    }

}

class OfficeComputer extends Computer {
    public OfficeComputer(String processor, int ram, int storage) {
        super(processor, ram, storage);
    }

    public void priceOfComputer() {
        if (processor.equals("i3") && ram == 70 && storage == 612) {
            System.out.println("Price " + 60000);
        } else if (processor.equals("i4") && ram == 80 && storage == 812) {
            System.out.println("Price " + 85000);
        } else if (processor.equals("i8") && ram == 90 && storage == 912) {
            System.out.println("Price " + 90000);
        }
    }
}

class Main {
    public static void main(String[] args) {

        GamingComputer c=new GamingComputer("i6",60,512);
        GamingComputer c1=new GamingComputer("i7",80,712);
        GamingComputer c2=new GamingComputer("i9",90,912);
        c.display();
        c.priceOfComputer();
        System.out.println("=======================");
        c1.display();
        c1.priceOfComputer();
        System.out.println("=======================");
        c2.display();
        c2.priceOfComputer();
        System.out.println("=======================");




        OfficeComputer c3=new OfficeComputer("i3",70,612);
        OfficeComputer c4=new OfficeComputer("i4",80,812);
        OfficeComputer c5=new OfficeComputer("i8",90,912);
        c3.display();
        c3.priceOfComputer();
        System.out.println("=======================");
        c4.display();
        c4.priceOfComputer();
        System.out.println("=======================");
        c5.display();
        c5.priceOfComputer();
    }
}