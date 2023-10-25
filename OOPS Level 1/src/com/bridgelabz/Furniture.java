package com.bridgelabz;

/*Write a Java program to create a class called "Furniture" with instance variables "type," "material,"
 and "price." Include a method to calculate the discount on the furniture based on its material and a method
  to print the furniture's type, material, and discounted price.*/
public class Furniture {
    String type;
    String material;
    double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public void discountOnFurniture() {

    }

    public void display() {
        System.out.println("Type of furniture : " + type);
        System.out.println("Material of furniture : " + material);
        System.out.println("Price of furniture : " + price);
    }
}
    class Sofa extends Furniture {
        public Sofa(String type, String material, double price) {
            super(type, material, price);
        }

        @Override
        public void discountOnFurniture() {
            double discountPercentage = 0;

            if (type.equals("SingleSofaChair") && material.equals("Wood")) {
                discountPercentage = 3;
            } else if (type.equals("DoubleSofaChair") && material.equals("Fabric")) {
                discountPercentage = 5;
            } else if (type.equals("ThreeSeatSofaChair") && material.equals("Fabric")) {
                discountPercentage = 7;
            }

            double discount = (discountPercentage / 100) * price;
            double discountedPrice = price - discount;

            System.out.println("Discount: " + discountPercentage + " %");
            System.out.println("Price with Discount: " + discountedPrice);

        }
    }

class Bed extends Furniture
{
    public Bed(String type, String material, double price) {
        super(type, material, price);
    }

    @Override
    public void discountOnFurniture() {

        double discountPercentage = 0;

        if(type.equals("SingleBed") && material.equals("Wood"))
        {
            discountPercentage = 3;
        }
        else if (type.equals("QueenBed") && material.equals("Fabric"))
        {
            discountPercentage = 5;
        }
        else if (type.equals("KingBed") && material.equals("DecorativeLaminate"))
        {
            discountPercentage = 7;
        }
        double discount = (discountPercentage / 100) * price;
        double discountedPrice = price - discount;

        System.out.println("Discount: " + discountPercentage + " %");
        System.out.println("Price with Discount: " + discountedPrice);
    }
}
class Test
{
    public static void main(String[] args) {
        Sofa s1=new Sofa("SingleSofaChair","Wood",10000);
        Sofa s2=new Sofa("DoubleSofaChair","Fabric",20000);
        Sofa s3=new Sofa("ThreeSeatSofaChair","Fabric",50000);

        s1.discountOnFurniture();
        s1.display();
        System.out.println("==============================");
        s2.discountOnFurniture();
        s2.display();
        System.out.println("==============================");
        s3.discountOnFurniture();
        s3.display();
        System.out.println("==============================");


        Bed b1=new Bed("SingleBed","Wood",15000);
        Bed b2=new Bed("QueenBed","Fabric",30000);
        Bed b3=new Bed("KingBed","DecorativeLaminate",35000);

        b1.discountOnFurniture();
        b1.display();
        System.out.println("==============================");
        b2.discountOnFurniture();
        b2.display();
        System.out.println("==============================");
        b3.discountOnFurniture();
        b3.display();

    }
}


